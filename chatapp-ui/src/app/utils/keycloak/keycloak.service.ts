import {Injectable} from '@angular/core';
import {Router} from '@angular/router';
import Keycloak from 'keycloak-js';

@Injectable({
  providedIn: 'root'
})
export class KeycloakService {

  private _keycloak: Keycloak | undefined;

  constructor(
    private router: Router
  ) {
  }

  get keycloak() {
    if (!this._keycloak) {
      this._keycloak = new Keycloak({
        url: 'http://localhost:9090',
        realm: 'chat-app',
        clientId: 'chatapp-clientid'
      });
    }
    return this._keycloak;
  }

  async init() {
    const authenticated = await this.keycloak.init({
      onLoad: 'login-required',
      // silentCheckSsoRedirectUri: `${window.location.origin}/silent-check-sso.html`,
      // checkLoginIframe: false
    });
  }

  async login() {
    await this.keycloak.login();
  }

  get userId(): string {
    return this.keycloak?.tokenParsed?.sub as string;
  }

  get isTokenValid(): boolean {
    return !this.keycloak.isTokenExpired();
  }

  get fullName(): string {
    return this.keycloak.tokenParsed?.['name'] as string;
  }

  logout() {
    return this.keycloak.logout({redirectUri: 'http://localhost:4200'});
  }

  accountManagement() {
    return this.keycloak.accountManagement();
  }
}
