package ZCW.Api.Practice.controllers;

import ZCW.Api.Practice.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    private PlayerService service;

    @Autowired
    public PlayerController(PlayerService service) { this.service = service; }



}
