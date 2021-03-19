package edu.itesm.challenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class AlbumsAdapter(private val albums: List<Album>)
    : RecyclerView.Adapter<AlbumsAdapter.AlbumsViewHolder>(){

    inner class AlbumsViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var lanzamiento = renglon.findViewById<TextView>(R.id.lanzamiento)
        var canciones = renglon.findViewById<TextView>(R.id.canciones)
        var portada = renglon.findViewById<ImageView>(R.id.portada)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_layout = inflater.inflate(R.layout.album_renglon, parent, false)
        return AlbumsViewHolder(renglon_layout)
    }

    override fun getItemCount(): Int {
        return albums.size
    }

    override fun onBindViewHolder(holder: AlbumsViewHolder, position: Int) {
        val album = albums[position]
        holder.portada.setImageResource(album.portada)
        holder.nombre.text = album.nombre
        holder.lanzamiento.text = album.lanzamiento
        holder.canciones.text = album.canciones

        holder.itemView.setOnClickListener {
            val action = AlbumsFragmentDirections.actionAlbumsFragmentToAlbumFragment(album)
            holder.itemView.findNavController().navigate(action)
            Toast.makeText(holder.itemView.context,"${album.secreto}",Toast.LENGTH_SHORT).show();
        }
    }
}