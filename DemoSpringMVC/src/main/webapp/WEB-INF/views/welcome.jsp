<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>WELCOME</title>
</head>
<script src="${pageContext.request.contextPath}/resources/project.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />

<body class="body" style="background-color: #EEEEEE">
	<nav class="nav navbar navbar-expand-md bg-dark navbar-dark fixed-top"
		style="height: 5vh">
		<div class="container">
			<a class="navbar-brand"><span> MY BRAND </span></a>
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a href="#NOW" class="nav-link">NOW</a></li>
				<li class="nav-item"><a href="#ALARM" class="nav-link">ALARM</a></li>
				<li class="nav-item"><a href="#REMINDER" class="nav-link">REMINDER</a></li>
				<li class="nav-item"><a href="#TODO" class="nav-link">TO-DO</a></li>
				<li class="nav-item"><a href="#NOTES" class="nav-link">NOTES</a></li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item btn-group"><a href="#"
					class="nav-link dropdown-toggle" id="settings-dropdown"
					data-toggle="dropdown" aria-expanded="true">SETTINGS</a>
					<div class="dropdown-menu" aria-labelledby="settings-dropdown">
						<a href="#" class="dropdown-item">HI </a> <a href="#PRIVACY"
							class="dropdown-item">Privacy Settings</a> <a href="#TIMEZONE"
							class="dropdown-item"> TIMEZONE</a> <a href="#LOGOUT"
							class="dropdown-item">LOGOUT</a>
					</div></li>
			</ul>
		</div>
	</nav>

	<div id="NOW" style="height: 100vh">
		<div id="time-container"
			class="container-fluid justify-content-between align-items-center d-flex bg-warning p-3"
			style="height: 25vh">
			<div class="col">
				<div class="item"></div>
			</div>
			<div class="col">
				<div class="item text-blink">
					<span id="mytime" class="font-weight-bold display-3 bg-warning p-1"></span>
				</div>
			</div>
			<div class="col">
				<div class="item"></div>
			</div>
		</div>


		<div class="container-fluid bg-danger" style="height: 75vh">
			<div id="calender-container" class="container-fluid d-flex"
				style="height: 75vh">
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="SUN" class="font-weight-bold text-warning">SUN</span><br>
						<span id="1" class="font-weight-bold">1</span><br> <span
							id="8" class="font-weight-bold">8</span><br> <span id="15"
							class="font-weight-bold">15</span><br> <span id="22"
							class="font-weight-bold">22</span><br> <span id="29"
							class="font-weight-bold">29</span>
					</div>
				</div>
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="MON" class="font-weight-bold">MON</span><br> <span
							id="2" class="font-weight-bold">2</span><br> <span id="9"
							class="font-weight-bold">9</span><br> <span id="16"
							class="font-weight-bold">16</span><br> <span id="23"
							class="font-weight-bold">23</span><br> <span id="30"
							class="font-weight-bold">30</span>
					</div>
				</div>
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="TUE" class="font-weight-bold">TUE</span><br> <span
							id="3" class="font-weight-bold">3</span><br> <span id="10"
							class="font-weight-bold">10</span><br> <span id="17"
							class="font-weight-bold">17</span><br> <span id="24"
							class="font-weight-bold">24</span><br> <span id="31"
							class="font-weight-bold">31</span>

					</div>
				</div>
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="WED" class="font-weight-bold">WED</span><br> <span
							id="4" class="font-weight-bold">4</span><br> <span id="11"
							class="font-weight-bold">11</span><br> <span id="18"
							class="font-weight-bold">18</span><br> <span id="25"
							class="font-weight-bold">25</span><br> <span id="32"
							class="font-weight-bold">32</span>
					</div>
				</div>
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="THUR" class="font-weight-bold">THUR</span><br> <span
							id="5" class="font-weight-bold">5</span><br> <span id="12"
							class="font-weight-bold">12</span><br> <span id="19"
							class="font-weight-bold">19</span><br> <span id="26"
							class="font-weight-bold">26</span><br> <span id="33"
							class="font-weight-bold">33</span>
					</div>
				</div>
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="FRI" class="font-weight-bold">FRI</span><br> <span
							id="6" class="font-weight-bold">6</span><br> <span id="13"
							class="font-weight-bold">13</span><br> <span id="20"
							class="font-weight-bold">20</span><br> <span id="27"
							class="font-weight-bold">27</span><br> <span id="34"
							class="font-weight-bold">34</span>
					</div>
				</div>
				<div class="col mt-2" style="text-align: center">
					<div class="item">
						<span id="SAT" class="font-weight-bold">SAT</span><br> <span
							id="7" class="font-weight-bold">7</span><br> <span id="14"
							class="font-weight-bold">14</span><br> <span id="21"
							class="font-weight-bold">21</span><br> <span id="28"
							class="font-weight-bold">28</span><br> <span id="35"
							class="font-weight-bold">35</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="ALARM" class="container-fluid bg-success d-flex"
		style="height: 100vh">
		<div class=" flex-container row align-self-center">
			<div class="col" style="width: 50vw"></div>
			<div class="col justify-content-center mx-auto" style="width: 50vw">
				<div class="card mx-auto" style="height: 40vh; width: 40vw">
					<form method="POST" class="form mx-auto my-auto">
						<div id="errmsg justify-content-center">
							<span id="errtime" class="text-warning bg-danger invisible ">
								Please choose a time. </span>
						</div>
						<div class="form-inline">
							<div class="form-group" style="width: 40hh">

								<label class="form-time-label text-secondary"
									style="width: 20hh">Set TIME</label> <input id="alarm-timing"
									type="time"
									class="form-control form-time-input m-3 bg-success text-secondary "
									placeholder="HH:MM" style="width: 20hh">
							</div>
							<div id="repeat" class="form-check form-group"
								style="width: 40hh">
								<input id="repeatCheckbox" type="checkbox"
									class="form-control form-check-input m-3 bg-success"
									style="width: 3hh" onclick="showRepeat(repeat, $(this));">
								<label class="form-check-label text-secondary"
									style="width: 37hh">Turn On Repeat-Mode</label>
							</div>
						</div>
						<div id="onrepeat"
							class="form-group form-inline border-top invisible">
							<div class="form-check" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">M</label>
							</div>
							<div class="form-check form-group" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">T</label>
							</div>
							<div class="form-check form-group" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">W</label>
							</div>
							<div class="form-check form-group" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">T</label>
							</div>
							<div class="form-check form-group" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">F</label>
							</div>
							<div class="form-check form-group" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">S</label>
							</div>
							<div class="form-check form-group" style="width: 6hh">
								<input type="checkbox" class="form-control form-check-input m-3"
									style="width: 3hh"> <label class="form-check-label"
									style="width: 3hh">S</label>
							</div>
						</div>
						<div class="form-group">
							<input type="button" value="Set"
								class="form-control btn btn-outline-primary"
								onclick="validateAlarm($(this));">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="REMINDER" class="container-fluid bg-warning d-flex"
		style="height: 100vh">
		<div class=" flex-container row align-self-center">
			<div class="col" style="width: 50vw">
				<div class="card" style="height: 60vh; width: 46.5vw">
					<div id="reminder1" class="mx-auto p-3" style="width: 30vw">
						<div class="flexbox bg-warning p-2 rounded border">
							<div class="row">
								<span class="text-secondary text-uppercase d-block"
									style="padding: 0px 0px 0px 15px"> Reminder Content </span>
							</div>
							<div class="row">
								<div class="col">
									<span class="text-secondary"> Time </span>
								</div>
								<div class="col text-right">
									<span class="text-secondary "> Date </span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col" style="width: 50vw"></div>
		</div>
	</div>
	<div id="TODO" class="container-fluid bg-danger d-flex"
		style="height: 100vh">
		<div class="flex-container row align-self-center">
			<div class="col " style="width: 50vw">
				<div class="card" style="height: 60vh; width: 46.5vw">


					<div class="form-group form-inline m-3 rounded bg-danger p-1">
						<label class="form-check-label text-light ">TODO ITEM 1</label> <input
							type="checkbox" class="form-control form-check-input ml-auto"
							style="width: 2vw; height: 2vw">
					</div>
					<div class="form-group form-inline m-3 rounded bg-danger p-1 ">
						<label class="form-check-label text-light ">TODO ITEM 1</label> <input
							type="checkbox" class="form-control form-check-input ml-auto"
							style="width: 2vw; height: 2vw">
					</div>
				</div>
			</div>
			<div class="col my-auto" style="width: 50vw; height: 40vh">
				<div class="card" style="height: 40vh; width: 46.5vw">
					<div class="form">
						<form method="POST">
							<div class="form-group form-inline m-3">
								<div class="">
									<button class="btn rounded-o" width=20px height=20px>
										<img class="rounded-o"
											src="https://img.icons8.com/cute-clipart/64/000000/plus-math.png"
											width=30px height=30px />
									</button>
								</div>
								<input type="text"
									class="form-control form-input bg-danger text-light border-none"
									placeholder="Add a new task here...">
							</div>
						</form>
					</div>

					<div class="form-group form-inline mt-auto">
						<div class="flex-container row mx-auto">
							<div class="col " style="width: 10vw height: 10vh">
								<button class="btn rounded-o ml-auto align-self-center">
									<img class="rounded-o"
										src="https://img.icons8.com/cute-clipart/64/000000/checkmark.png"
										width=30px height=30px />
								</button>
							</div>
							<div class="col" style="width: 10vw height: 10vh">
								<button class="btn rounded-o mr-auto align-self-center">
									<img class="rounded-o"
										src="https://img.icons8.com/cute-clipart/64/000000/pause-squared.png"
										width=30px height=30px />
								</button>
							</div>
							<div class="col" style="width: 10vw height: 10vh">
								<button class="btn rounded-o align-self-center">
									<img class="rounded-o"
										src="https://img.icons8.com/fluent/48/000000/waste--v1.png"
										width=30px height=30px />
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="NOTES" class="container-fluid bg-warning d-flex"
		style="height: 100vh">
	
	
	
	
	
	
	
	
	</div>
</body>
</html>