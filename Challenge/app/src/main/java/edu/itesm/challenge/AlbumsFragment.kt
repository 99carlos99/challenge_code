package edu.itesm.challenge

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_albums.*

class AlbumsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_albums, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        album_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AlbumsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Album>{
        val albums = ArrayList<Album>()
        albums.add(Album(R.drawable.please, "Please, Please Me","1963","Please Please Me es el álbum debut de la banda británica de rock The Beatles, lanzado el 22 de marzo de 1963 en el Reino Unido. Su publicación acompaña el inicio de la Beatlemanía, después del éxito de los sencillos «Please Please Me» y «Love Me Do».", "Love, love me do"))
        albums.add(Album(R.drawable.with, "With The Beatles","1963","With the Beatles es el segundo álbum de estudio de la banda británica de rock, The Beatles, empezado a grabar apenas cuatro meses después de haberse publicado Please Please Me, y editado el 22 de noviembre de 1963 en mono y en estéreo en el sello discográfico Parlophone.","There were bells..."))
        albums.add(Album(R.drawable.hard, "A Hard Day's Night","1964","A Hard Day's Night es el tercer álbum de estudio de la banda británica de rock, The Beatles, publicado el 10 de julio de 1964 por la compañía discográfica Parlophone, con el número de catálogo PMC 1230 y PCS 3058.","I Should have known better"))
        albums.add(Album(R.drawable.sale, "Beatles For Sale","1964","Beatles for Sale es el cuarto álbum de estudio de la banda británica de rock, The Beatles, publicado el 4 de diciembre de 1964 por la compañía discográfica Parlophone, con el número de catálogo PMC 1240 y PCS 3062.","Eight Days a Week"))
        albums.add(Album(R.drawable.help, "Help!","1965","Help! es el quinto álbum de estudio de la banda británica de rock, The Beatles, al mismo tiempo que banda sonora de su película de mismo título.","all my troubles semeed so far away..."))
        albums.add(Album(R.drawable.soul, "Rubber Soul","1965","Rubber Soul es el sexto álbum de estudio de la banda británica de rock The Beatles, lanzado el 3 de diciembre de 1965. Producido por George Martin, fue grabado en solo cuatro semanas para así poder aprovechar el mercado navideño.","If I needed someone"))
        albums.add(Album(R.drawable.revolver, "Revolver","1966","Revolver es el séptimo álbum de estudio de la banda británica de rock The Beatles lanzado el 5 de agosto de 1966 por EMI. Fue el último álbum lanzado antes de que la banda decidiera abandonar los escenarios y las giras, a favor de la experimentación en los estudios de grabación y mejoramiento de su estilo.","And Your Bird Can Sing"))
        albums.add(Album(R.drawable.peppers, "Sgt. Peppers Lonely Hearts Club Band","1967","Sgt. Pepper's Lonely Hearts Club Band es el octavo álbum de estudio de la banda británica de rock, The Beatles.","Lovely Rita"))
        albums.add(Album(R.drawable.tour, "Magical Mistery Tour","1967","Magical Mystery Tour es un disco de la banda de rock inglesa The Beatles, sería lanzado como un doble EP en Reino Unido y como un LP en Estados Unidos. Incluye también la banda sonora de la película para televisión del mismo nombre.","Roll up!"))
        albums.add(Album(R.drawable.white, "The Beatles","1968","The Beatles es el décimo álbum de estudio de la banda inglesa de rock The Beatles, lanzado el 22 de noviembre de 1968.","I look at them all..."))
        albums.add(Album(R.drawable.let, "Let It Be","1970","Let It Be -En español: Déjalo ser- es el duodécimo y último álbum de estudio de la banda de pop rock británica The Beatles. Fue lanzado el 8 de mayo de 1970, días después de que se hiciera oficial la salida de Paul McCartney de la banda, y con ella la disolución pública del grupo.","All I Want is You"))
        albums.add(Album(R.drawable.road, "Abbey Road","1969","Abbey Road es el duodécimo álbum de estudio publicado por la banda británica de rock y pop The Beatles. Fue lanzado el 26 de septiembre de 1969 en el Reino Unido, y el 1 de octubre del mismo año en los Estados Unidos.","...and in the end..."))
        albums.add(Album(R.drawable.masters, "Past Masters","1988","Past Masters es un doble álbum recopilatorio de The Beatles publicado en 1988 después de la publicación en 1987 de los álbumes de estudio del Reino Unido en CD. Past Masters recoge las pistas que no fueron lanzadas en álbumes de estudio, de modo que todo el catálogo de la banda podría estar disponible en CD.","Matchbox"))
        albums.add(Album(R.drawable.one, "1","2000","1 es una recopilación de 27 de los sencillos de The Beatles que alcanzaron la primera posición de las listas oficiales pop de Inglaterra y/o Estados Unidos. Con la asistencia del productor George Martin, fue publicado el 13 de noviembre de 2000.","Number 1,2,3,4!"))
        albums.add(Album(R.drawable.ant, "Anthology","2000","The Beatles Anthology es el título de un proyecto enfocado en la historia musical del grupo británico The Beatles, consistente en un documental de ocho episodios, tres álbumes y un libro monográfico.","Free as a Bird"))
        return albums
    }


}