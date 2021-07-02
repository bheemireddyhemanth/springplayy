package com.example.controller;
import com.example.entity.Player;
import com.example.main.*;
import com.example.service.Playerservice;

import java.util.*;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Playercontroller
{
@Autowired
Playerservice ps;
@RequestMapping(value="/player") //get
public List<Player> getALL()
{
 return ps.getallplayers();
}
@RequestMapping(value="/playerfind/{id}")   //get
public Player getdetails(@PathVariable int id)
{
	return ps.getplayer(id);
}
@RequestMapping(value="/save" , method=RequestMethod.POST)  //post
public void save(@RequestBody Player play)
{
	 ps.saveplayer(play);
}

@RequestMapping(value="/update", method= RequestMethod.PUT)

public void update(@RequestBody Player play)
{
	ps.update(play);
}
@RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
public void delete(@PathVariable int id)
{
	ps.delete(id);
}
}