package entidade;

public class EmailService {
	
	private String de;
	private String para;
	private String assunto;
	private String conteudo;
	
	public EmailService() {
		super();
		this.de = "marcus@gmail.com";
		this.para = "marcus@gmail.com";
		this.assunto = "Email";
		this.conteudo = "Conteudo";
	}
	
	public EmailService(String de, String para, String assunto, String conteudo) {
		super();
		this.de = de;
		this.para = para;
		this.assunto = assunto;
		this.conteudo = conteudo;
	}

	public static void enviarEmail() {
		System.out.println("Email enviado");
	}
	
}
