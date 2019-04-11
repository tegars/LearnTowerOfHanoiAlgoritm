# Tower of Hanoi Algoritm Using Java 
Also called the <b> Tower of Brahma</b> or <b>Lucas' Tower</b> is a mathematical game or puzzle
<br/><br/>
find by : Eduard Lucas (Franc) <br/>
find on : 1883 <br/>
<br/>
Click <a href="http://www.web-games-online.com/towers-of-hanoi/">Link</a> if you want to play this game.

Rule of This Algorithm:<br/>
<ol>
	<li>there are 3 tower, namely A tower, B tower and C tower</li>
	<li>Move N disk to destination tower</li>	
	<li>a larger disk should not be put on the smaller disk</li>
</ol>

Algorithm:
<ol>
	<li>Move (Top N-1) from origin to mediator</li>
	<li>Move the most big disk to destination</li>
	<li>Move coll disk (Top N-1) from mediator to destination</li>
</ol>

Example: [1] <br/>
How Recurf running in 3 Disk <br/>
<ol>
	<li>Move disk 3 from A to C</li>
	<li>Move disk 2 from A to B </li>
	<li>Move disk 3 from C to B</li>
	<li>Move disk 1 from A to C</li>
	<li>Move disk 3 from B to A</li>
	<br/>
	<li>Move disk 2 from B to C</li>
	<li>Move disk 3 from A to C</li>
</ol>
<img src="https://1.bp.blogspot.com/-y4sfP0IXYGA/XK7A8sosClI/AAAAAAAAAcg/jH4MCinyRl8Jyv0t-A4TSVC9K4GvSZMmQCLcBGAs/s640/3%2Bmenara%2Bhanoi.jpg" height="500" width="500">

Example: [2] <br/>
How Recurf running in 4 Disk <br/>
you can see this image <br/>
<img src="https://3.bp.blogspot.com/-p_t-2AAbWes/XK7A8l6OixI/AAAAAAAAAcc/bU7BLapZEfMupH37JhdF0Gt9fDgAJ0XYACLcBGAs/s640/4%2Bmenara%2Bhanoi.jpg" height="500" width="500">
<br/><hr/>
-Like Algorithm
