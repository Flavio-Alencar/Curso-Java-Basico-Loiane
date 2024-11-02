//Exemplo 01 - Aula 35
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 02NOV24 - 15h39
//Assunto: Relacionamento tem um
//Vinculado a classe Contato

package exemplos.Aula36;

public class TesteContato {
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        
        contato.setNome("Flávio Alencar");
        
        Endereco end = new Endereco();
        end.setEndereco("SQSW 500 Bloco H Apt");
        end.setNumero("610");
        end.setBairro("Sudoeste");
        end.setCidade("Brasília");
        end.setEstado("Distrito Federal");
        end.setCep("71.000-000");
        
        contato.setEndereco(end);
        
        Telefone tel1 = new Telefone();
        tel1.setTipo("Residência");
        tel1.setDdd("(61)");
        tel1.setNumero("9999-8888");
        
        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setDdd("(61)");
        tel2.setNumero("8888-2222");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel1;
        telefones[1] = tel2;
            
        
        
        contato.setTelefones(telefones);
       
        
        
        System.out.println(contato.getNome());
        
        if(contato != null && contato.getEndereco() != null){
        System.out.println(contato.getEndereco().getCidade());
        }
        
        if(contato != null && contato.getTelefones() != null){
            for(int i = 0; i < telefones.length; i++){
                System.out.println(contato.getTelefones()[i].getTipo());
            }
        }
        
    }
    
}
