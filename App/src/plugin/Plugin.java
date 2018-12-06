package plugin;

import static app.Main.createCar;
import interfaces.ICarFactory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Scanner;

public class Plugin {
    private String[] plugins;
    private URL[] jars;
    private ArrayList<String> pluginList;
    
    public Plugin(){
        this.pluginList = new ArrayList<String>();
    }
    
    public void createCar(ICarFactory factory){
        IMotor motor = factory.createMotor();
        motor.turn();
        IChassi chassi = factory.createChassi();
        chassi.drawNumber();
        IPneu pneu = factory.createPneu();
        pneu.calibrate();
        System.out.println("\n");
    }
    
    public ArrayList<String> loadPlugins() throws MalformedURLException, 
            ClassNotFoundException, InstantiationException, IllegalAccessException{
        //int op;
        //do{
          File currentDir = new File("./plugins");
          String []plugins = currentDir.list();
          this.plugins = plugins;
          int i;
          URL[] jars = new URL[plugins.length];
          this.jars = jars;
          for (i = 0; i < plugins.length; i++){
            this.pluginList.add(plugins[i].split("\\.")[0]);
            //System.out.println(i+1 + " - " + plugins[i].split("\\.")[0]);
            jars[i] = (new File("./plugins/" + plugins[i])).toURL();//conversão para url
          }
          URLClassLoader ulc = new URLClassLoader(jars);
          /*System.out.println(i+1 + " - Plugin refresh");
          System.out.println("Escolha sua opção ou 0 para sair: ");
          Scanner sc = new Scanner(System.in);
          op = sc.nextInt();
          if (op != 0 && op != i+1)
          {
            String factoryName = plugins[op-1].split("\\.")[0];
              ICarFactory factory = (ICarFactory) Class.forName(factoryName.toLowerCase() + "." + 
              factoryName, true, ulc).newInstance();
            createCar(factory);
          }*/
        //}while (op != 0);
        
        return this.pluginList;
    }
    
    public String inicializePlugin(String plugin) throws ClassNotFoundException, InstantiationException, 
            IllegalAccessException{
        String retorno = null;
        URLClassLoader ulc = new URLClassLoader(jars);
        
        String factoryName = plugin.split("\\.")[0];
              ICarFactory factory = (ICarFactory) Class.forName(factoryName.toLowerCase() + "." + 
              factoryName, true, ulc).newInstance();
            createCar(factory);
        return retorno;
    }
    
}
