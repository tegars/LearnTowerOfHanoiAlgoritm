# algoritm-tower-of-hanoi
also called the <b> Tower of Brahma</b> or <b>Lucas' Tower</b> is a mathematical game or puzzle
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

Example: [2] <br/>
How Recurf running in 4 Disk <br/>
you can see this image
<img src="https://rusdyana.files.wordpress.com/2009/11/hanoi1.jpg" height="300" width="300">
