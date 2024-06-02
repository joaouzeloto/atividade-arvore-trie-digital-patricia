import java.lang.*;
public class Tree
{
    private No raiz;

    public Tree(){raiz=null;}

    public void inserir(String palavra)
    {
        String auxPala = palavra.toLowerCase(), pAbaixo;
        No aux;
        int n;
        if(raiz==null)
        {
            No novo = new No();
            n = auxPala.charAt(0)-'a';
            novo.setlChar(n,auxPala.charAt(0));
            novo.setIndice(1);
            novo.setlNo(n,new No(auxPala));
            raiz = novo;
        }
        else
        {
            aux = raiz;
            n = auxPala.charAt(0)-'a';
            if(aux.getlNo(n)==null)
            {
                aux.setlChar(n,auxPala.charAt(0));
                aux.setlNo(n,new No(auxPala));
            }
            else
            {
                No pai = aux;
                n = auxPala.charAt(0)-'a';
                boolean flag = true;
                while(aux!=null&&flag)
                {
                    aux = aux.getlNo(n);
                    int i = 0;
                    while (i < 26 && aux.getlChar(i) == '.')
                        i++;
                    if(i<26)
                    {
                        pAbaixo = aux.getlNo(i).getPalavra();
                        i = 0;
                        int j = 0;
                        while (i < auxPala.length() && j < pAbaixo.length() && auxPala.charAt(i) == pAbaixo.charAt(j)) {
                            i++;
                            j++;
                        }
                        if (i>=auxPala.length()&&j<pAbaixo.length()||j<pAbaixo.length()&&i<auxPala.length()&&auxPala.charAt(i)!=pAbaixo.charAt(j))
                        {
                            if (i >= auxPala.length())
                                i--;
                            No novo = new No();
                            novo.setIndice(i);
                            novo.setlChar(auxPala.charAt(i) - 'a', auxPala.charAt(i));
                            novo.setlNo(auxPala.charAt(i) - 'a', aux);
                            aux.setPalavra(auxPala);
                            flag = false;
                            pai.setlNo(n,novo);
                        }
                        else
                        {
                            if (i<auxPala.length()&&j<pAbaixo.length()&&auxPala.charAt(i)==pAbaixo.charAt(j))
                            {
                                aux.setlChar(auxPala.charAt(i) - 'a', auxPala.charAt(i));
                                aux.setlNo(auxPala.charAt(i) - 'a', new No(auxPala));
                                flag = false;
                            }
                            else
                            {
                                if (j >= pAbaixo.length())
                                {
                                    pai = aux;
                                    i = 0;
                                    while (i < 26 && aux.getlChar(i) == '.')
                                        i++;
                                    n = i;
                                }
                            }
                        }
                    }
                    else
                    {
                        pAbaixo = aux.getPalavra();
                        i = 0;
                        int j = 0;
                        while (i < auxPala.length() && j < pAbaixo.length() && auxPala.charAt(i) == pAbaixo.charAt(j)) {
                            i++;
                            j++;
                        }
                        if(j>=pAbaixo.length()&&i < auxPala.length()) {
                            j--;
                            aux.setIndice(j + 1);
                            aux.setlChar(pAbaixo.charAt(j) - 'a', pAbaixo.charAt(j));
                            aux.setlNo(pAbaixo.charAt(j) - 'a', new No(auxPala));
                            flag = false;
                        }
                        else
                        {
                            aux.setIndice(i+1);
                            aux.setlChar(auxPala.charAt(i)-'a',auxPala.charAt(i));
                            aux.setlChar(pAbaixo.charAt(i)-'a', pAbaixo.charAt(i));
                            aux.setlNo(auxPala.charAt(i)-'a',new No(auxPala));
                            aux.setlNo(pAbaixo.charAt(i)-'a',new No(pAbaixo));
                            aux.setPalavra(null);
                            flag = false;
                        }
                    }
                }
            }
        }
    }

    public void mostrarInformacoes()
    {
        if(raiz!=null)
        {
            No aux = raiz;
            FilaNo f1 = new FilaNo(), f2 = new FilaNo(),f3 = new FilaNo();
            f1.inserir(aux);
            while (!f1.vazia())
            {
                while (!f1.vazia())
                {
                    aux = f1.retirar().getNo();
                    f2.inserir(aux);
                    f3.inserir(aux);
                }
                while (!f3.vazia())
                {
                    aux = f3.retirar().getNo();
                    for(int i=0;i<26;i++)
                        if(aux.getlNo(i)!=null)
                            f1.inserir(aux.getlNo(i));
                }
            }

            while(!f2.vazia())
            {
                aux = f2.retirar().getNo();
                for(int i =0;i<26;i++)
                    if(aux.getlChar(i)!='.')
                        System.out.print(aux.getlChar(i)+" ");
                if(aux.getPalavra()!=null)
                    System.out.print("palavra: "+ aux.getPalavra());
                System.out.println();
            }
        }
    }

    public No procuraPalavra(String palavra)
    {
        if(raiz!=null)
        {
            No aux = raiz;
            char letra;
            int i = 0;
            boolean flag = true;
            while(flag)
            {
                if(aux.getPalavra()!=null&&aux.getPalavra().equals(palavra.toLowerCase()))
                    flag = false;
                else
                {
                    letra = palavra.charAt(aux.getIndice()-1);
                    if(aux.getlNo(letra-'a')!=null)
                        aux = aux.getlNo(letra-'a');
                    else
                        flag = false;
                }

            }
            if(aux.getPalavra()!=null&&aux.getPalavra().equals(palavra.toLowerCase()))
                return aux;

        }
        return null;
    }


    public void exbirPalavras()
    {
        if(raiz!=null)
        {
            No aux = raiz;
            FilaNo f1 = new FilaNo(), f2 = new FilaNo(),f3 = new FilaNo();
            f1.inserir(aux);
            while (!f1.vazia())
            {
                while (!f1.vazia())
                {
                    aux = f1.retirar().getNo();
                    f2.inserir(aux);
                    f3.inserir(aux);
                }
                while (!f3.vazia())
                {
                    aux = f3.retirar().getNo();
                    for(int i=0;i<26;i++)
                        if(aux.getlNo(i)!=null)
                            f1.inserir(aux.getlNo(i));
                }
            }

            while(!f2.vazia())
            {
                aux = f2.retirar().getNo();
                if(aux.getPalavra()!=null)
                    System.out.println("palavra: "+ aux.getPalavra());
            }
        }
    }
}
