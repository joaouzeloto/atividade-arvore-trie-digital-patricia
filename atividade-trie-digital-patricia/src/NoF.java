public class NoF
{
    private No no;
    private NoF prox;

    public NoF(No noT)
    {
        no = noT;
        prox =null;
    }

    public No getNo() {
        return no;
    }

    public void setNo(No no) {
        this.no = no;
    }

    public NoF getProx() {
        return prox;
    }

    public void setProx(NoF prox) {
        this.prox = prox;
    }
}
