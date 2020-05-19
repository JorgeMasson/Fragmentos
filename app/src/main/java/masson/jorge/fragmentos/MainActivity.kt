package masson.jorge.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_frag1.setOnClickListener {
            cambiarFragmento(1)
        }

        btn_frag2.setOnClickListener {
            cambiarFragmento(2)
        }

        btn_frag3.setOnClickListener {
            cambiarFragmento(3)
        }

    }

    fun cambiarFragmento(op: Int) {
        val transaccion = supportFragmentManager.beginTransaction()
        var fragmento = Fragment()

        when(op) {
            1 -> fragmento = InicioFragment()
            2 -> fragmento = HistoriasFragment()
            3 -> fragmento = PerfilFragment()
        }

        transaccion.replace(R.id.contenedor, fragmento)
        transaccion.addToBackStack(null)
        transaccion.commit()

    }

}
