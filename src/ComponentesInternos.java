import javax.swing.*;

public class ComponentesInternos extends ComponentesExternos{
    String marcs,modelos,colors,componentes;
    public ComponentesInternos(String Marcass,String Modelos,String Colors,String Componentes){
        super(Marcass,Modelos,Colors,Componentes);
        this.marcs=Marcass;
        this.modelos=Modelos;
        this.colors=Colors;
        this.componentes=Componentes;
    }
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null,"Marca de la computadora: \n" + marcas + "Modelo de la computadora: " + modelos + "Color de la computadora: \n" + colores + "Modelo de los componentes externos: \n" + modelo + "Marca del componente externo: \n" + marca + "Nombre del componente externo: \n" + nombre + "Marca del componente interno: \n" + marcs + "Modelo del componente interno: \n" + modelos + "Color del componente interno: \n" + colors + "Nombre del componente interno: \n" + componentes);
    }
}
