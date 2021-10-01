package apuntes;

public class gestionficheros {
}
package file;

import java.io.*;


public class VerDir {


    public
    static void main(String[] args) {


        //String
        dir = "."; //Directorio actual

        String
                dir ="C:\\ULHI\\DAM\\AD";


        File
                f = new File(dir);


        String[]
                archivos = f.list();


        System.out.printf("Ficheros
                en el directorio actual: %d %n", archivos.length);


        for
        (int i = 0; i < archivos.length; i++) {


            File
                    f2 = new File(f, archivos[i]);


            System.out.printf("Nombre:
                    %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f2.isFile(),


            f2.isDirectory());


        }


    }


}


    El siguiente ejemplo muestra información del fichero  seleccionado;
    VerInf (0.01 MB)


package file;





        import java.io.*;


public class VerInf {


    public static void main(String[] args) {



        System.out.println("INFORMACIÓN SOBRE EL FICHERO:");


        File f = new
                File("C:\\ULHI\\DAM\\AD\\AD\\UD2\\src\\File\\VerInf.java");


        if(f.exists()){



            System.out.println("Nombre del fichero  : "+f.getName());



            System.out.println("Ruta                : "+f.getPath());



            System.out.println("Ruta absoluta       : "+f.getAbsolutePath());



            System.out.println("Se puede leer       : "+f.canRead());



            System.out.println("Se puede escribir   : "+f.canWrite());



            System.out.println("Tamaño              : "+f.length());


            System.out.println("Es
                    un directorio    :
            "+f.isDirectory());


            System.out.println("Es
                    un fichero       : "+f.isFile());


            System.out.println("Nombre
                    del directorio padre: "+f.getParent());


        }


    }


}
