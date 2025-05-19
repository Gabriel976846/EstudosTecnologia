package Intermediario.Records;

public record teste(
        String nome, String email, int telefone)
{

    public String teste(){
        return email.toUpperCase();
    }
}
