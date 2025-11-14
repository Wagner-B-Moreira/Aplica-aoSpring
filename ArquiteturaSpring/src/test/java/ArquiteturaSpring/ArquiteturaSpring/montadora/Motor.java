package ArquiteturaSpring.ArquiteturaSpring.montadora;

public class Motor {

    private String  modelo;
    private Integer  cavalos;
    private  Integer  cinlidros;
    private Double listragem;
    private TipoMotor tipo;



    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCinlidros() {
        return cinlidros;
    }

    public void setCinlidros(Integer cinlidros) {
        this.cinlidros = cinlidros;
    }

    public Double getListragem() {
        return listragem;
    }

    public void setListragem(Double listragem) {
        this.listragem = listragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cinlidros=" + cinlidros +
                ", listragem=" + listragem +
                ", tipo=" + tipo +
                '}';
    }
}
