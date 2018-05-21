
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
<div class="pcoded-content">
	<div class="pcoded-inner-content">

		<!-- Main-body start -->
		<div class="main-body">
			<div class="page-wrapper">
				<div class="page-body m-t-40">
					<!-- Page-header start -->
					<div class="page-header card">
						<div class="row align-items-end">
							<div class="col-lg-8">
								<div class="page-header-title">
									<i class="icofont icofont-file-code bg-c-yellow"></i>
									<div class="d-inline">
										<h4>Planning des soutenance</h4>

									</div>
								</div>
							</div>
							<div class="col-lg-4">
								<div class="page-header-breadcrumb">
									<ul class="breadcrumb-title">
										<li class="breadcrumb-item"><a href="fiche-de-voeux.html">
												<i class="icofont icofont-home"></i>
										</a></li>
										<li class="breadcrumb-item"><a href="#!">Consulter</a></li>
										<li class="breadcrumb-item"><a href="#!">Planning des
												soutenances</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<!-- Page-header end -->
					<!--/*********************************************************************************************-->
					<!-- Page body start -->
					<div class="page-body">
						<div class="row">
							<div class="col-sm-1"></div>
							<div class="col-sm-10">
								<!-- Basic Form Inputs card start -->
								<div class="card">
									<div class="card-header">

										<div class="card-header-right">
											<i class="icofont icofont-spinner-alt-5"></i>
										</div>

										<div class="card-header-right">
											<i class="icofont icofont-spinner-alt-5"></i>
										</div>

									</div>
									<div class="card-block">

										<div class="row">
											<div class="col-md-12">

												<form action="SoutenanceController" method="POST">
													<div class="form-group">
														<label for="dateN">Date début soutenances</label> <input
															type="date" name="DateSoutenance" class="form-control">
													</div>
													<button class="btn hor-grd btn-grd-inverse">Planifier
														les soutenances</button>
												</form>
											</div>
										</div>
										<!--row ends-->

									</div>
								</div>
								<!-- Basic Form Inputs card end -->
							</div>
							<div class="col-sm-1"></div>
						</div>
					</div>
					<!-- Page body end -->
					<!--/*********************************************************************************************-->
				</div>
			</div>
		</div>
		<!-- Main-body end -->
		<div id="styleSelector"></div>
	</div>
</div>
</div>
</div>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>