<template>
  <div>
      <v-container>
      <v-row no-gutters>
        <v-col cols="12">
            
            <v-card
            color="green"
            dark
            >
            <v-card-title class="text-h5">
                CEP {{ ceps.cep }}
            </v-card-title>
            <v-list-item>
            <v-row >
                <v-col  md="4">
                    
                    <p>Rua</p>
                    <v-text-field
                    v-model="logradouro"
                    :label= ceps.logradouro 
                    solo
                    ></v-text-field>
                
                    <p>Complemento</p>
                    <v-text-field
                    v-model="complemento"
                    :label= ceps.complemento 
                    solo
                    ></v-text-field>

                    <p>Bairro</p>
                    <v-text-field
                    v-model="bairro"
                    :label= ceps.bairro 
                    solo
                    ></v-text-field>
                </v-col>

                <v-col md="4">

                    <p>Cidade</p>
                    <v-text-field
                    v-model="localidade"
                    :label= ceps.localidade 
                    solo
                    ></v-text-field>

                    <p>Estado</p>
                    <v-text-field
                    v-model="uf"
                    :label= ceps.uf 
                    solo
                    ></v-text-field>

                    <p>IBGE</p>
                    <v-text-field
                    v-model="ibge"
                    :label= ceps.ibge 
                    solo
                    ></v-text-field>
                </v-col>

                <v-col md="4">
                    <p>GIA</p>
                    <v-text-field
                    v-model="gia"
                    :label= ceps.gia 
                    solo
                    ></v-text-field>

                    <p>Numero</p>
                    <v-text-field
                    v-model="ddd"
                    :label= ceps.ddd 
                    solo
                    ></v-text-field>

                    <p>Siafi</p>
                    <v-text-field
                    v-model="siafi"
                    :label= ceps.siafi 
                    solo
                    ></v-text-field>
                </v-col>
                
            </v-row>
            </v-list-item>

            <v-card-actions>
                    <v-btn color="error" @click="deletar"  >Excluir</v-btn>
                    <v-btn color="orange" @click="edita" >Editar</v-btn>
            </v-card-actions>

          </v-card>
            
        </v-col>
      </v-row>
      </v-container>
  </div>
</template>

<script>
const axios = require('axios').default;

export default {
    name: 'Ceps',

    props: {
        ceps: { type: Object[Array], required: true }
    },

    methods: {

        deletar: function() {
            
          axios
          .post('http://localhost:8080/deletaEndereco?codigo=' + this.ceps.id)
          
        },
        edita: function() {
          
            //passar novas informações
            console.log(this.ceps.siafi)
          axios
          .post('http://localhost:8080/editaEndereco?codigo=' + this.ceps.id)
          
        }
    },

     data: () => {
      return {
            
                logradouro: "",
                complemento: "",
                bairro: "",
                localidade: "",
                uf: "",
                ibge: "",
                gia: "",
                ddd: "",
                siafi: ""
            
      }
    },
   
  
    

};
</script>

<style>

</style>