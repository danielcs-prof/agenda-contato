module org.dev.agendacontato {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires org.postgresql.jdbc;

    opens org.dev.agendacontato to javafx.fxml;

    exports org.dev.agendacontato;

}