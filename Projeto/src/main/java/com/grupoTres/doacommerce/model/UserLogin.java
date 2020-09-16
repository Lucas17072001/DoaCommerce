package com.grupoTres.doacommerce.model;

public class UserLogin {

		private String nome_razao;
		
		private String email;
		
		private String senha;
		
		private String token;

		public String getNome() {
			return nome_razao;
		}

		public void setNome(String nome_razao) {
			this.nome_razao = nome_razao;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

}