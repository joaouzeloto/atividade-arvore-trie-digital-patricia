public class FilaNo
{
    private NoF inicio, fim;

    public FilaNo()
    {
        inicio = fim = null;
    }

    public void inserir(No no)
    {
        NoF novo = new NoF(no);
        if(inicio==null)
            inicio = fim = novo;
        else
        {
            fim.setProx(novo);
            fim = novo;
        }
    }

    public NoF retirar()
    {
        NoF aux = inicio;
        inicio = inicio.getProx();
        return aux;
    }

    public boolean vazia()
    {return inicio==null;}



}
