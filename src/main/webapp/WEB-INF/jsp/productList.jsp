<!DOCTYPE html >
<html lang="en" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<title>Hk Sales</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Little Closet template">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <jsp:include page="common/import.jsp"/>
</head>
<body>

<div class="super_container">
  <jsp:include page="common/header.jsp"/>
	<div class="super_container_inner">
		<div class="super_overlay"></div>


		<!-- Products -->

		<div class="products">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 offset-lg-3">
						<div class="section_title text-center">Healthkart Sales Live</div>
					</div>
				</div>
				<div class="row page_nav_row">
					<div class="col">
						<div class="page_nav">
							<ul class="d-flex flex-row align-items-start justify-content-center">
								<li class="active"><a href="category.html">Women</a></li>
								<li><a href="category.html">Men</a></li>
								<li><a href="category.html">Kids</a></li>
							</ul>
						</div>
					</div>
				</div>

				<div class="row products_row">
					<c:forEach items="${variantDetailList}" var="variantDetail">
					<!-- Product -->
					<div class="col-xl-4 col-md-6">
						<div class="product">
							<div class="product_image" style="text-align: center;"><img src="${variantDetail.imageUrl}" alt=""></div>
							<div class="product_content">
								<div class="product_info d-flex flex-row align-items-start justify-content-start">
									<div>
										<div>
											<div class="product_name"><a href="product.html">${variantDetail.name}</a></div>
											<div class="product_category">In <a href="category.html">Category</a></div>
										</div>
									</div>
									<div class="ml-auto text-right">
										<div class="rating_r rating_r_${variantDetail.rating} home_item_rating"><i></i><i></i><i></i><i></i><i></i></div>
										<div class="product_price text-right">${variantDetail.mrp}</div>
									</div>
								</div>
								<div class="product_buttons">
									<div class="product_button product_cart text-center d-flex flex-column align-items-center justify-content-center">
                                        <div><div><img src="images/cart.svg" class="svg" alt="" onclick="updateShippingCart('${variantDetail.id}')"><div>+</div></div></div>
                                    </div>
									<div class="text-right d-flex flex-row align-items-start justify-content-start">
										<div class="product_button product_fav text-center d-flex flex-column align-items-center justify-content-center">
											<div><span id="${variantDetail.id}"></span></div>
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
                     </c:forEach>

				</div>
				<div class="row load_more_row">
					<div class="col">
						<div class="button load_more ml-auto mr-auto"><a href="#">load more</a></div>
					</div>
				</div>
			</div>
		</div>

		<!-- Boxes -->


		<!-- Features -->

		<div class="features">
			<div class="container">
				<div class="row">
					
					<!-- Feature -->
					<div class="col-lg-4 feature_col">
						<div class="feature d-flex flex-row align-items-start justify-content-start">
							<div class="feature_left">
								<div class="feature_icon"><img src="images/icon_1.svg" alt=""></div>
							</div>
							<div class="feature_right d-flex flex-column align-items-start justify-content-center">
								<div class="feature_title">Start Shopping</div>
							</div>
						</div>
					</div>

					<!-- Feature -->
					<div class="col-lg-4 feature_col">
						<div class="feature d-flex flex-row align-items-start justify-content-start">
							<div class="feature_left">
								<div class="feature_icon ml-auto mr-auto"><img src="images/icon_2.svg" alt=""></div>
							</div>
							<div class="feature_right d-flex flex-column align-items-start justify-content-center">
								<div class="feature_title">Buy Premium Products</div>
							</div>
						</div>
					</div>

					<!-- Feature -->
					<div class="col-lg-4 feature_col">
						<div class="feature d-flex flex-row align-items-start justify-content-start">
							<div class="feature_left">
								<div class="feature_icon"><img src="images/icon_3.svg" alt=""></div>
							</div>
							<div class="feature_right d-flex flex-column align-items-start justify-content-center">
								<div class="feature_title">Take Away your Products</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

  <jsp:include page="common/footer.jsp"/>
	</div>
		
</div>

<script>
updateShippingCart(){}
</script>

</body>
</html>