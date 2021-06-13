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
                    :label= ceps.logradouro 
                    solo
                    ></v-text-field>
                
                    <p>Complemento</p>
                    <v-text-field
                    :label= ceps.complemento 
                    solo
                    ></v-text-field>

                    <p>Bairro</p>
                    <v-text-field
                    :label= ceps.bairro 
                    solo
                    ></v-text-field>
                </v-col>

                <v-col md="4">

                    <p>Cidade</p>
                    <v-text-field
                    :label= ceps.localidade 
                    solo
                    ></v-text-field>

                    <p>Estado</p>
                    <v-text-field
                    :label= ceps.uf 
                    solo
                    ></v-text-field>

                    <p>IBGE</p>
                    <v-text-field
                    :label= ceps.ibge 
                    solo
                    ></v-text-field>
                </v-col>

                <v-col md="4">
                    <p>GIA</p>
                    <v-text-field
                    :label= ceps.gia 
                    solo
                    ></v-text-field>

                    <p>Numero</p>
                    <v-text-field
                    :label= ceps.ddd 
                    solo
                    ></v-text-field>

                    <p>Siafi</p>
                    <v-text-field
                    :label= ceps.siafi 
                    solo
                    ></v-text-field>
                </v-col>
                
            </v-row>
            </v-list-item>
          </v-card>
            
        </v-col>
      </v-row>
      </v-container>
  </div>
</template>

<script>


export default {
    name: 'Ceps',

    props: {
        ceps: { type: Object[Array], required: true }
    },

    
   
  
    

};
</script>

<style>

</style>