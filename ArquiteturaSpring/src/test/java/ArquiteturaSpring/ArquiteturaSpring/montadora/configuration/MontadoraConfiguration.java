package ArquiteturaSpring.ArquiteturaSpring.montadora.configuration;


import ArquiteturaSpring.ArquiteturaSpring.montadora.Motor;
import ArquiteturaSpring.ArquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "MotorAspirado")
     public Motor motot() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCinlidros(4);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return  motor;

    }

    @Bean(name = "MotorEletrico")
    public Motor mototEletrico() {
        var motor = new Motor();
        motor.setCavalos(220);
        motor.setCinlidros(3);
        motor.setModelo("XPH-0");
        motor.setTipo(TipoMotor.ELETRICO);
        return  motor;

    }

    @Bean(name = "MotorTurbo")
    public Motor mototTurbo() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCinlidros(5);
        motor.setModelo("HPTY-0");
        motor.setTipo(TipoMotor.TURBO);
        return  motor;

    }
}
