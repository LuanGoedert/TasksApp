package com.example.tasks.service.repository

import com.example.convidados.ui.Service.Repository.remote.RetrofitClient
import com.example.tasks.service.HeaderModel
import com.example.tasks.service.repository.remote.PersonService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PersonRepository {

   private val mRemote = RetrofitClient.createService(PersonService::class.java)

    fun login(email: String, password: String) {

        val call: Call<HeaderModel> = mRemote.login(email, password)
        //remote.login(email, password)

        //Async
        call.enqueue(object: Callback<HeaderModel> {
            override fun onResponse(call: Call<HeaderModel>, response: Response<HeaderModel>) {
                val header = response.body()
            }

            override fun onFailure(call: Call<HeaderModel>, t: Throwable) {
                val s = ""
            }

        })


    }
}