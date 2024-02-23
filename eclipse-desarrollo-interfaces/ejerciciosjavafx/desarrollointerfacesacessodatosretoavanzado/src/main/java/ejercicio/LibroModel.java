package ejercicio;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class LibroModel {
    private ObservableList<Libro> listaLibros = FXCollections.observableArrayList();

    public ObservableList<Libro> getListaLibros() {
        cargarLibrosDesdeBaseDeDatos();
        return listaLibros;
    }

    private void cargarLibrosDesdeBaseDeDatos() {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Query<Libro> query = session.createQuery("FROM Libro", Libro.class);
            List<Libro> libros = query.getResultList();
            listaLibros.setAll(libros);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void agregarLibro(Libro libro) {
        // Agrega el libro a la lista y a la base de datos
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(libro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        listaLibros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        // Elimina el libro de la lista y de la base de datos
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(libro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        listaLibros.remove(libro);
    }
}
