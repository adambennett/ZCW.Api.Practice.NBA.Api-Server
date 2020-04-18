package ZCW.Api.Practice.services;

import ZCW.Api.Practice.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class TeamService {

    private TeamRepository repo;

    @Autowired
    public TeamService(TeamRepository repo) { this.repo = repo; }

}
