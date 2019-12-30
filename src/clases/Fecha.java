
package clases;


public class Fecha {
    String dia ,mes,año;

    public Fecha() {
        
    }

    public Fecha(String dia, String mes, String año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        if(Integer.parseInt(dia)<10){
            this.dia = "0"+dia;
        }
        else{
            this.dia = dia;
        }
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        switch (mes){
            case "Enero":
                this.mes = "01";
                break;
            case "Febrero":
                this.mes = "02";
                break;
            case "Marzo":
                this.mes = "03";
                break;
            case "Abril":
                this.mes = "04";
                break;
            case "Mayo":
                this.mes = "05";
                break;
            case "Junio":
                this.mes = "06";
                break;
            case "Julio":
                this.mes = "07";
                break;
            case "Agosto":
                this.mes = "08";
                break;
           case "Septiembre":
                this.mes = "09";
                break;
            case "Octubre":
                this.mes = "10";
                break;
            case "Noviembre":
                this.mes = "11";
                break;
            case "Diciembre":
                this.mes = "12";
                break;
        }
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return año+mes+dia;
    }
    
}
