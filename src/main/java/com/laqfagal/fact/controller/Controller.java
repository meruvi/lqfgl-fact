package com.laqfagal.fact.controller;

import com.laqfagal.fact.api.ApiAdapter;
import com.laqfagal.fact.api.ApiService;
import com.laqfagal.fact.request.LoginRequest;
import com.laqfagal.fact.response.DataResponse;
import com.laqfagal.fact.service.ParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import retrofit2.Call;
import retrofit2.Response;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ParametroService parametroService;

    @GetMapping("/login")
    public String login(LoginRequest loginRequest) {
        return "login";
    }

    @GetMapping("/index")
    public String index(LoginRequest loginRequest) {
        return "index";
    }

    @PostMapping("/signin")
    public String signin(@Valid LoginRequest loginRequest, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "login";
        }

        ApiService service = ApiAdapter.createService(ApiService.class);
        Call<DataResponse> callSync = service.login(loginRequest);

        try {
            Response<DataResponse> response = callSync.execute();
            DataResponse dataResponse = response.body();

            return "redirect:/index";
        } catch (Exception ex) {
            ex.printStackTrace();

            return "redirect:/login";
        }
    }

    /*
    @PostMapping("/signin")
    public String addUser(@Valid LoginRequest loginRequest, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "login";
        }

        ApiService service = ApiAdapter.createService(ApiService.class);
        Call<DataResponse> callSync = service.getTipoDocumento();

        try {
            Response<DataResponse> response = callSync.execute();
            DataResponse dataResponse = response.body();

            return "redirect:/index";
        } catch (Exception ex) {
            ex.printStackTrace();

            return "redirect:/login";
        }
    }
     */
}
