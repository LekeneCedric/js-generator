module com.osscameroon.jsgenerator.core {
    exports com.osscameroon.jsgenerator.core;
    exports com.osscameroon.jsgenerator.core.autoconfigure;

    opens com.osscameroon.jsgenerator.core.autoconfigure;

    requires lombok;
    requires org.jsoup;
    requires spring.boot;
    requires spring.context;

    requires spring.boot.autoconfigure;
}
