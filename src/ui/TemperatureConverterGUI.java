package ui; //Esqueleto copiado de scene builder (view - show sample controller squeleton)

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.TemperatureConverter;

public class TemperatureConverterGUI {

    @FXML
    private Label labMesg;

    @FXML
    private TextField txtCelsius;

    @FXML
    public void convertCelsiusToFahrenheit(ActionEvent event) {
    	String strCelsius= txtCelsius.getText();
    	try {
	    	double celsius= Double.parseDouble(strCelsius); //se pasa la string a double
	    	
	    	double fah= TemperatureConverter.celsiusToFahrenheit(celsius);
	    	String message= celsius+"°C is equal to "+fah+"°F";
	    	labMesg.setText(message);
    	}catch(NumberFormatException nfe) {
    		labMesg.setText("El valor digitado no es numerico, por favor corrijalo");
    	}
    	
    }

}

