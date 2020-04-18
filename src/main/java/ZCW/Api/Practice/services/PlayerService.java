package ZCW.Api.Practice.services;

import ZCW.Api.Practice.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class PlayerService {

    private PlayerRepository repo;

    @Autowired
    public PlayerService(PlayerRepository repo) { this.repo = repo; }

}
