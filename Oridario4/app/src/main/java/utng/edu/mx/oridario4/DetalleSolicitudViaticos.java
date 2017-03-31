package utng.edu.mx.oridario4;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by jony on 30/03/17.
 */

public class DetalleSolicitudViaticos implements KvmSerializable {

    private int id;
    private String montoSolicitado;
    private String montoOtorgado;
    private String montoComprobado;
    private String comprobacionValida;
    private String solicitudViatico;
    private String partida;

    public DetalleSolicitudViaticos(int id, String montoSolicitado, String montoOtorgado, String montoComprobado, String comprobacionValida, String solicitudViatico, String partida) {
        this.id = id;
        this.montoSolicitado = montoSolicitado;
        this.montoOtorgado = montoOtorgado;
        this.montoComprobado = montoComprobado;
        this.comprobacionValida = comprobacionValida;
        this.solicitudViatico = solicitudViatico;
        this.partida = partida;
    }

    public DetalleSolicitudViaticos() {
        this(0, "", "", "", "", "", "");
    }

    @Override
    public Object getProperty(int i) {
        switch (i) {
            case 0:
                return id;
            case 1:
                return montoSolicitado;
            case 2:
                return montoOtorgado;
            case 3:
                return montoComprobado;
            case 4:
                return comprobacionValida;
            case 5:
                return solicitudViatico;
            case 6:
                return partida;
        }

        return  null;
    }

    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void setProperty(int i, Object o) {
        switch (i) {
            case 0:
                 id = Integer.parseInt(o.toString());
            case 1:
                 montoSolicitado =o.toString();
            case 2:
                 montoOtorgado=o.toString();
            case 3:
                 montoComprobado=o.toString();
            case 4:
                 comprobacionValida=o.toString();
            case 5:
                solicitudViatico=o.toString();
            case 6:
                 partida=o.toString();
        }

    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {

        switch (i) {


            case 0:
                propertyInfo.type = PropertyInfo.INTEGER_CLASS;
                propertyInfo.name = "id";
                break;
            case 1:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "montoSolicitado";
                break;
            case 2:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "montoOtorgado";
                break;
            case 3:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "montoComprobado";
                break;
            case 4:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "comprobacionValida";
                break;
            case 5:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "solicitudViatico";
                break;
            case 6:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "partida";
                break;

            default:
                break;
        }
    }
}
