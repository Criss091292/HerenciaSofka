package sofka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisorTest {
    Televisor tv = new Televisor();
    @Test
    void calcularPrecioFinal() {
        assertEquals(700000.0,tv.calcularPrecioFinal('A',true,40, false));
        assertEquals(800000.0,tv.calcularPrecioFinal('A',false,40, false));
        assertEquals(600000.0,tv.calcularPrecioFinal('B',true,40, false));
        assertEquals(700000.0,tv.calcularPrecioFinal('B',false,40, false));
        assertEquals(500000.0,tv.calcularPrecioFinal('C',true,40, false));
        assertEquals(600000.0,tv.calcularPrecioFinal('C',false,40, false));
        assertEquals(910000.0,tv.calcularPrecioFinal('A',true,41, false));
        assertEquals(1040000.0,tv.calcularPrecioFinal('A',false,41, false));
        assertEquals(780000.0,tv.calcularPrecioFinal('B',true,41, false));
        assertEquals(910000.0,tv.calcularPrecioFinal('B',false,41, false));
        assertEquals(650000.0,tv.calcularPrecioFinal('C',true,41, false));
        assertEquals(780000.0,tv.calcularPrecioFinal('C',false,41, false));
        assertEquals(950000.0,tv.calcularPrecioFinal('A',true,40, true));
        assertEquals(1050000.0,tv.calcularPrecioFinal('A',false,40, true));
        assertEquals(850000.0,tv.calcularPrecioFinal('B',true,40, true));
        assertEquals(950000.0,tv.calcularPrecioFinal('B',false,40, true));
        assertEquals(750000.0,tv.calcularPrecioFinal('C',true,40, true));
        assertEquals(850000.0,tv.calcularPrecioFinal('C',false,40, true));
        assertEquals(1160000.0,tv.calcularPrecioFinal('A',true,41, true));
        assertEquals(1290000.0,tv.calcularPrecioFinal('A',false,41, true));
        assertEquals(1030000.0,tv.calcularPrecioFinal('B',true,41, true));
        assertEquals(1160000.0,tv.calcularPrecioFinal('B',false,41, true));
        assertEquals(900000.0,tv.calcularPrecioFinal('C',true,41, true));
        assertEquals(1030000.0,tv.calcularPrecioFinal('C',false,41, true));
        assertThrows(IllegalArgumentException.class,()->{
            tv.calcularPrecioFinal('D', false, 41, true);});
    }




}