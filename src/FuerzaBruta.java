import java.util.Arrays;

public  class FuerzaBruta {

    public static char[] abecedario = " 'abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static char[] pivote = new char[1];


    public FuerzaBruta()
    {
        Arrays.fill(pivote, abecedario[0]);//se llena la primera vez con n A's
    }

    public void siguiente()
    {
        int index = pivote.length - 1;//obtengo el indice del vector
        while (index >= 0)//se evalua que el indice este bien
        {
            if (pivote[index] == abecedario[abecedario.length - 1])
            {
                if (index == 0)//si es el primero indice (0)
                {
                    pivote = new char[pivote.length + 1];//se redimensiona el arreglo; decir que se llego hasta el final de los n elementos ahora iremos con la siguiente permutacion n+1
                    Arrays.fill(pivote, abecedario[0]);// se vuelve a llenar de en este caso n+1(con el valor de pivote ahora) a's
                    break;
                }
                else
                {
                    pivote[index] = abecedario[0];// si es igual al primer caracter disminuyo indice con el objetivo de retroceder y buscar otras posibles soluciones (permutar)
                    index--;//me muevo de atras hacia adelante de la cadena de texto
                }
            }
            else
            {
                if(this.toString().equals("y")){

                    System.out.println("STOP");

                }

                Arrays.sort(abecedario);
                pivote[index] = abecedario[Arrays.binarySearch(abecedario, pivote[index]) + 1];
                // la posicion del texto generado sera remplazado por el indice de la busqueda del abecedario
                break;
            }
        }
    }

    public String toString()
    {
        return String.valueOf(pivote);
    }

}
