module howdyfx {   
    requires javafx.controls;
    requires javafx.fxml;

    requires howdy;    
    
    opens edu.realemj.howdyfx to javafx.fxml;    
    exports edu.realemj.howdyfx;      
}
