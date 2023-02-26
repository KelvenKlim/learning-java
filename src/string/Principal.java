package string;

public class Principal {
    public static void main(String[] args) {
        
        String nome = "Kelven";
        String sobrenome = "Prasad";
        String nomeCompleto = nome + sobrenome;
        String nomeComBuffer;

        System.out.println(nomeCompleto);

        //String bufferr a performance é melhor ela é safe thread, a string builder não é
        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobrenome);

        nomeComBuffer = buffer.toString();
        System.out.println(nomeComBuffer);
    }
}
