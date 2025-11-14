package ArquiteturaSpring.ArquiteturaSpring.montadora.api;
import ArquiteturaSpring.ArquiteturaSpring.montadora.CarroStatus;
import ArquiteturaSpring.ArquiteturaSpring.montadora.Chave;
import ArquiteturaSpring.ArquiteturaSpring.montadora.HondaHRV;
import ArquiteturaSpring.ArquiteturaSpring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Carros")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorEletrico")
    private Motor motor;

    @PostMapping
    public CarroStatus LigarCarro(@RequestBody Chave chave) {
        var carro =  new HondaHRV(motor);
       return  carro.darIngnicao(chave);

    }
}
