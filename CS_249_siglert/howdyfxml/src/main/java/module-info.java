module howdyfxml {
    requires javafx.controls;
    requires javafx.fxml;

    requires howdy;    
    
    opens edu.realemj.howdyfxml to javafx.fxml;
    exports edu.realemj.howdyfxml;
}
