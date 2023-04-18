package study.web.api.repository;

import org.springframework.stereotype.Repository;
import study.web.api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save (Usuario usuario){
        if (usuario.getId() == null)
            System.out.println("SAVE- Recebendo o usuário na camada de repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositorio");
        System.out.println(usuario);
    }
    public void deleteById  (Integer id){
        System.out.printf(String.format("DELETE/ID - Recebendo o id para excluir um usuário%n", id));
        System.out.println(id);
    }
    public List<Usuario> ListAll(){
        System.out.println("Listando usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("larissa", "harrystyles"));
        usuarios.add(new Usuario("joanderson","lovelly"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }

}
