package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.*;

import java.util.*;

@Service
public class Playerservice 
{
List<Player> p=new ArrayList<Player>();
	public Playerservice()
	{
	p.add(new Player(1, "hemanth"));
	p.add(new Player(2, "balu"));
	p.add(new Player(3, "sunny"));
	}
public List<Player> getallplayers()
{
	return p;
}

public Player getplayer(int id)
{
	for(Player pl:p)
	{
		if(id==pl.id)
		{
			return pl;
		}
	}
	return null;
}

public void saveplayer(Player player)
{
	this.p.add(player);
}
 public void update(Player player)
 {
	 for(Player pla:p)
	 {
		 if(player.id==pla.id)
		 {
			pla.setName(player.getName());;
		 }
	 }
 }
 public void delete(int id)
 {
	 p.remove(id);
 }
}
