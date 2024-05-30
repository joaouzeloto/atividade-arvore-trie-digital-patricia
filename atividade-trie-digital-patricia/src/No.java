import java.lang.*;

public class No
{
    private char []lChar;
    private int indice;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    private No []lNo;
    private String palavra;

    public No()
    {
        this.lChar = new char[26];
        for(int i=0;i<26;i++)
            lChar[i]='.';
        this.lNo = new No[26];
    }

    public No(String p)
    {
        this.lChar = new char[26];
        for(int i=0;i<26;i++)
            lChar[i]='.';
        this.lNo = new No[26];
        palavra = p;
    }

    public char getlChar(int pos) {
        return lChar[pos];
    }

    public void setlChar(int pos,char l) {
        lChar[pos] = l;
    }

    public No getlNo(int pos) {
        return lNo[pos];
    }

    public void setlNo(int pos,No no) {
        this.lNo[pos] = no;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String pala) {
        palavra = pala;
    }
}
