import { Postagem } from "./Postagem"

export class User{
    public idUsuario: number    //id
    public nome: string
    public email: string        //usuario
    public senha: string
    public foto: string
    public tipo: string
    public userPosts: Postagem[]
}