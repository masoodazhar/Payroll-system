<%@include file="include/head.jsp" %>
<body class="theme-orange">

<!-- Page Loader -->
<div class="page-loader-wrapper">
    <div class="loader">
        <div class="m-t-30"><img src="https://thememakker.com/templates/lucid/hr/html/assets/images/logo-icon.svg" width="48" height="48" alt="Lucid"></div>
        <p>Please wait...</p>        
    </div>
</div>
<!-- Overlay For Sidebars -->

<div id="wrapper">

    <nav class="navbar navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-btn">
                <button type="button" class="btn-toggle-offcanvas"><i class="lnr lnr-menu fa fa-bars"></i></button>
            </div>

            <div class="navbar-brand">
                <a href="index-2.html"><img src="https://thememakker.com/templates/lucid/hr/html/assets/images/logo.svg" alt="Lucid Logo" class="img-responsive logo"></a>                
            </div>
            
            <div class="navbar-right">
                <form id="navbar-search" class="navbar-form search-form">
                    <input value="" class="form-control" placeholder="Search here..." type="text">
                    <button type="button" class="btn btn-default"><i class="icon-magnifier"></i></button>
                </form>               

                <div id="navbar-menu">
                    <ul class="nav navbar-nav">                        
                        <li><a href="app-events.html" class="icon-menu d-none d-sm-block d-md-none d-lg-block"><i class="icon-calendar"></i></a></li>
                        <li><a href="app-chat.html" class="icon-menu d-none d-sm-block"><i class="icon-bubbles"></i></a></li>
                        <li><a href="app-inbox.html" class="icon-menu d-none d-sm-block"><i class="icon-envelope"></i><span class="notification-dot"></span></a></li>
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                <i class="icon-bell"></i>
                                <span class="notification-dot"></span>
                            </a>
                            <ul class="dropdown-menu notifications animated shake">
                                <li class="header"><strong>You have 4 new Notifications</strong></li>
                                <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-info text-warning"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Campaign <strong>Holiday Sale</strong> is nearly reach budget limit.</p>
                                                <span class="timestamp">10:00 AM Today</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>                               
                                <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-like text-success"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Your New Campaign <strong>Holiday Sale</strong> is approved.</p>
                                                <span class="timestamp">11:30 AM Today</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                 <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-pie-chart text-info"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Website visits from Twitter is 27% higher than last week.</p>
                                                <span class="timestamp">04:00 PM Today</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-info text-danger"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Error on website analytics configurations</p>
                                                <span class="timestamp">Yesterday</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li class="footer"><a href="javascript:void(0);" class="more">See all notifications</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle icon-menu" data-toggle="dropdown"><i class="icon-equalizer"></i></a>
                            <ul class="dropdown-menu user-menu menu-icon animated bounceIn">
                                <li class="menu-heading">ACCOUNT SETTINGS</li>
                                <li><a href="javascript:void(0);"><i class="icon-note"></i> <span>Basic</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-equalizer"></i> <span>Preferences</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-lock"></i> <span>Privacy</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-bell"></i> <span>Notifications</span></a></li>
                                <li class="menu-heading">BILLING</li>
                                <li><a href="javascript:void(0);"><i class="icon-credit-card"></i> <span>Payments</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-printer"></i> <span>Invoices</span></a></li>                                
                                <li><a href="javascript:void(0);"><i class="icon-refresh"></i> <span>Renewals</span></a></li>
                            </ul>
                        </li>
                        <li><a href="page-login.html" class="icon-menu"><i class="icon-login"></i></a></li>                        
                    </ul>
                </div>
            </div>
        </div>
    </nav>
     <%@include file="include/navbarTopArea.jsp" %> 
    <%@include file="include/navbar.jsp" %>

    <div id="main-content">
        <div class="container-fluid">
            <div class="block-header">
                <div class="row">
                    <div class="col-lg-6 col-md-8 col-sm-12">
                        <h2><a href="javascript:void(0);" class="btn btn-xs btn-link btn-toggle-fullwidth"><i class="fa fa-arrow-left"></i></a> Project Dashboard</h2>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index-2.html"><i class="icon-home"></i></a></li>                            
                            <li class="breadcrumb-item active">Dashboard</li>
                        </ul>
                    </div>            
                    <div class="col-lg-6 col-md-4 col-sm-12 text-right">
                        <div class="bh_chart hidden-xs">
                            <div class="float-left m-r-15">
                                <small>Visitors</small>
                                <h6 class="mb-0 mt-1"><i class="icon-user"></i> 1,784</h6>
                            </div>
                            <span class="bh_visitors float-right">2,5,1,8,3,6,7,5</span>
                        </div>
                        <div class="bh_chart hidden-sm">
                            <div class="float-left m-r-15">
                                <small>Visits</small>
                                <h6 class="mb-0 mt-1"><i class="icon-globe"></i> 325</h6>
                            </div>
                            <span class="bh_visits float-right">10,8,9,3,5,8,5</span>
                        </div>
                        <div class="bh_chart hidden-sm">
                            <div class="float-left m-r-15">
                                <small>Chats</small>
                                <h6 class="mb-0 mt-1"><i class="icon-bubbles"></i> 13</h6>
                            </div>
                            <span class="bh_chats float-right">1,8,5,6,2,4,3,2</span>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row clearfix">
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card text-center bg-info">
                        <div class="body">
                            <div class="p-15 text-light">
                                <h3>19</h3>
                                <span>Today Works</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card text-center bg-secondary">
                        <div class="body">
                            <div class="p-15 text-light">
                                <h3>15</h3>
                                <span>Today Tasks</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card text-center bg-warning">
                        <div class="body">
                            <div class="p-15 text-light">
                                <h3>125</h3>
                                <span>Statistics</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card text-center bg-dark">
                        <div class="body">
                            <div class="p-15 text-light">
                                <h3>318</h3>
                                <span>Analytics</span>
                            </div>
                        </div>
                    </div>
                </div>                
            </div>

            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="card">
                        <div class="header">
                            <h2>Wrok Report</h2>
                            <ul class="header-dropdown">
                                <li class="dropdown">
                                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"></a>
                                    <ul class="dropdown-menu dropdown-menu-right animated bounceIn">
                                        <li><a href="javascript:void(0);">Action</a></li>
                                        <li><a href="javascript:void(0);">Another Action</a></li>
                                        <li><a href="javascript:void(0);">Something else</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="body">                            
                            <div id="m_area_chart" class="m-b-20" style="height: 250px;"></div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row clearfix">
                <div class="col-lg-4 col-md-6">
                    <div class="card">
                        <div class="body">
                        <div class="list-group list-widget">
                            <a href="app-inbox.html" class="list-group-item">
                                <span class="badge badge-success">654</span>
                                <i class="fa fa-envelope text-muted"></i>Inbox</a>
                            <a href="javascript:void(0);" class="list-group-item">
                                <span class="badge badge-info">364</span>
                                <i class="fa fa-eye text-muted"></i> Profile visits</a>
                            <a href="javascript:void(0);" class="list-group-item">
                                <span class="badge badge-warning">12</span>
                                <i class="fa fa-phone text-muted"></i> Call</a>
                            <a href="javascript:void(0);" class="list-group-item">
                                <span class="badge badge-danger">54</span>
                                <i class="fa fa-comments-o text-muted"></i> Messages</a>
                            <a href="javascript:void(0);" class="list-group-item">
                                <span class="badge badge-warning">19</span>
                                <i class="fa fa-bookmark text-muted"></i> Bookmarks</a>
                            <a href="javascript:void(0);" class="list-group-item">
                                <span class="badge">56</span>
                                <i class="fa fa-bell text-muted"></i> Notifications</a>
                            <a href="javascript:void(0);" class="list-group-item">
                                <span class="badge badge-info">25</span>
                                <i class="fa fa-clock-o text-muted"></i> Watch</a>
                        </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="card top_counter">
                        <div class="body">
                            <div class="icon">
                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                            </div>
                            <div class="content m-t-5">
                                <div>Team Leader</div>
                                <h6>Maryam Amiri</h6>
                            </div>
                        </div>
                        <hr>
                        <div class="body">
                            <div class="icon">
                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                            </div>
                            <div class="content m-t-5">
                                <div>Angular Champ</div>
                                <h6>Fidel Tonn</h6>
                            </div>
                        </div>
                        <hr>
                        <div class="body">
                            <div class="icon">
                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                            </div>
                            <div class="content m-t-5">
                                <div>UI UX Desiger</div>
                                <h6>Tim Hank</h6>
                            </div>
                        </div>
                        <hr>
                        <div class="body">
                            <div class="icon">
                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                            </div>
                            <div class="content m-t-5">
                                <div>Sales Lead</div>
                                <h6>Gary Camara</h6>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12">
                    <div class="card">
                        <div class="header">
                            <h2>ToDo List <small>This Month task list</small></h2>
                        </div>
                        <div class="body todo_list">
                            <div class="dd nestable-with-handle m-b-15">
                                <ol class="dd-list">
                                    <li class="dd-item dd3-item" data-id="1">
                                        <div class="dd-handle dd3-handle"></div>
                                        <div class="dd3-content">
                                            <label class="fancy-checkbox mb-0">
                                                <input type="checkbox" name="checkbox" checked>
                                                <span><i class=" icon-calendar m-r-5"></i> Report Panel Usag</span>
                                            </label>
                                        </div>
                                        <ol class="dd-list">
                                            <li class="dd-item dd3-item" data-id="1">
                                                <div class="dd-handle dd3-handle"></div>
                                                <div class="dd3-content">
                                                    <label class="fancy-checkbox mb-0">
                                                        <input type="checkbox" name="checkbox">
                                                        <span>Report Panel Usag</span>
                                                    </label>
                                                </div>
                                            </li>
                                        </ol>
                                    </li>
                                    <li class="dd-item dd3-item" data-id="1">
                                        <div class="dd-handle dd3-handle"></div>
                                        <div class="dd3-content">
                                            <label class="fancy-checkbox mb-0">
                                                <input type="checkbox" name="checkbox">
                                                <span><i class="icon-bell m-r-5"></i> New logo design</span>
                                            </label>
                                        </div>
                                    </li>
                                    <li class="dd-item dd3-item" data-id="1">
                                        <div class="dd-handle dd3-handle"></div>
                                        <div class="dd3-content">
                                            <label class="fancy-checkbox mb-0">
                                                <input type="checkbox" name="checkbox">
                                                <span>Design PSD files</span>
                                            </label>
                                        </div>
                                    </li>
                                    <li class="dd-item dd3-item" data-id="1">
                                        <div class="dd-handle dd3-handle"></div>
                                        <div class="dd3-content">
                                            <label class="fancy-checkbox mb-0">
                                                <input type="checkbox" name="checkbox">
                                                <span>Deploy existing code</span>
                                            </label>
                                        </div>
                                    </li>
                                    <li class="dd-item dd3-item" data-id="1">
                                        <div class="dd-handle dd3-handle"></div>
                                        <div class="dd3-content">
                                            <label class="fancy-checkbox mb-0">
                                                <input type="checkbox" name="checkbox" checked>
                                                <span><i class=" icon-calendar m-r-5"></i> Report Panel Usag</span>
                                            </label>
                                        </div>
                                    </li>
                                    <li class="dd-item dd3-item" data-id="1">
                                        <div class="dd-handle dd3-handle"></div>
                                        <div class="dd3-content">
                                            <label class="fancy-checkbox mb-0">
                                                <input type="checkbox" name="checkbox">
                                                <span><i class="icon-bell m-r-5"></i> New logo design</span>
                                            </label>
                                        </div>
                                    </li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row clearfix">
                <div class="col-lg-12 col-md-12">
                    <div class="card">
                        <div class="header">
                            <h2>Team Details</h2>
                        </div>
                        <div class="body team_list">
                            <div class="dd" data-plugin="nestable">
                                <ol class="dd-list">
                                    <li class="dd-item" data-id="1">
                                        <div class="dd-handle">Desiger</div>
                                        <div class="dd-content top_counter">
                                            <div class="icon">
                                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                                            </div>
                                            <div class="content m-t-5">
                                                <div>UI UX Desiger</div>
                                                <h6>Tim Hank</h6>
                                            </div>
                                        </div>
                                        <ol class="dd-list">
                                            <li class="dd-item" data-id="1">
                                                <div class="dd-handle">Team Member</div>
                                                <div class="dd-content">
                                                    <h6 class="m-b-15">Info about Design Team <span class="badge badge-success float-right">New</span></h6>                                
                                                    <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
                                                    <ul class="list-unstyled team-info m-t-20 m-b-20">
                                                        <li class="m-r-15"><small class="text-muted">Team</small></li>
                                                        <li><img src="${avatar2Jpg}" title="Avatar" alt="Avatar"></li>
                                                        <li><img src="${avatar2Jpg}" title="Avatar" alt="Avatar"></li>
                                                        <li><img src="${avatar2Jpg}" title="Avatar" alt="Avatar"></li>
                                                    </ul>
                                                    <div class="progress-container l-black m-b-20">
                                                        <span class="progress-badge">Prograss</span>
                                                        <div class="progress">
                                                            <div class="progress-bar l-parpl" role="progressbar" aria-valuenow="68" aria-valuemin="0" aria-valuemax="100" style="width: 68%;">
                                                                <span class="progress-value">68%</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-7">
                                                            <small>PROJECTS: 12</small>
                                                            <h6>BUDGET: 4,870 USD</h6>
                                                        </div>
                                                        <div class="col-5">
                                                            <div class="sparkline text-right m-t-10" data-type="bar" data-width="97%" data-height="26px" data-bar-Width="2" data-bar-Spacing="7" data-bar-Color="#333333">2,5,8,3,5,7,1,6</div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                        </ol>
                                    </li>
                                    <li class="dd-item" data-id="1">
                                        <div class="dd-handle">Sales</div>
                                        <div class="dd-content top_counter">
                                            <div class="icon">
                                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                                            </div>
                                            <div class="content m-t-5">
                                                <div>Sales Lead</div>
                                                <h6>Gary Camara</h6>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="dd-item" data-id="1">
                                        <div class="dd-handle">Developer</div>
                                        <div class="dd-content top_counter">
                                            <div class="icon">
                                                <img src="${avatar2Jpg}" class="rounded-circle" alt="">
                                            </div>
                                            <div class="content m-t-5">
                                                <div>Project Lead</div>
                                                <h6>Fidel Tonn</h6>
                                            </div>
                                        </div>
                                        <ol class="dd-list">
                                            <li class="dd-item" data-id="1">
                                                <div class="dd-handle">FrontEnd Developer</div>
                                                <div class="dd-content">
                                                    <ul class="list-unstyled team-info">
                                                        <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                        <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    </ul>
                                                </div>
                                            </li>
                                            <li class="dd-item" data-id="1">
                                                <div class="dd-handle">PHP Expert</div>
                                                <div class="dd-content">
                                                    <ul class="list-unstyled team-info">
                                                        <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                        <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                        <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                        <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    </ul>
                                                </div>
                                            </li>
                                        </ol>
                                    </li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row clearfix">

                <div class="col-lg-8 col-md-12">
                    <div class="card">
                        <div class="header">
                            <h2>Project List</h2>
                            <ul class="header-dropdown">
                                <li class="dropdown">
                                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"></a>
                                    <ul class="dropdown-menu dropdown-menu-right animated bounceIn">
                                        <li><a href="javascript:void(0);">Action</a></li>
                                        <li><a href="javascript:void(0);">Another Action</a></li>
                                        <li><a href="javascript:void(0);">Something else</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="body">                          
                            <div class="table-responsive">
                                <table class="table m-b-0 table-hover">
                                    <thead class="thead-dark">
                                        <tr>                                    
                                            <th>Application</th>
                                            <th>Team</th>
                                            <th>Change</th>
                                            <th>Sales</th>                                    
                                            <th>Price</th>
                                            <th>Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>
                                                <h6>Alpino 4.1</h6>
                                                <span>WrapTheme To By Again</span>
                                            </td>
                                            <td>
                                                <ul class="list-unstyled team-info">
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                </ul>
                                            </td>
                                            <td>
                                                <div class="sparkline text-left" data-type="line" data-width="8em" data-height="20px" data-line-Width="1.5" data-line-Color="#00c5dc"
                                                data-fill-Color="transparent">3,5,1,6,5,4,8,3</div>
                                            </td>
                                            <td>11,200</td>
                                            <td>$83</td>
                                            <td><strong>$22,520</strong></td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <h6>Compass 2.0</h6>
                                                <span>WrapTheme To By Again</span>
                                            </td>
                                            <td>
                                                <ul class="list-unstyled team-info">
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>                                                    
                                                </ul>
                                            </td>
                                            <td>
                                                <div class="sparkline text-left" data-type="line" data-width="8em" data-height="20px" data-line-Width="1.5" data-line-Color="#f4516c"
                                                data-fill-Color="transparent">4,6,3,2,5,6,5,4</div>
                                            </td>
                                            <td>11,200</td>
                                            <td>$66</td>
                                            <td><strong>$13,205</strong></td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <h6>Nexa 1.1</h6>
                                                <span>WrapTheme To By Again</span>
                                            </td>
                                            <td>
                                                <ul class="list-unstyled team-info">
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>                                                
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                </ul>
                                            </td>
                                            <td>
                                                <div class="sparkline text-left" data-type="line" data-width="8em" data-height="20px" data-line-Width="1.5" data-line-Color="#31db3d"
                                                data-fill-Color="transparent">7,3,2,1,5,4,6,8</div>
                                            </td>
                                            <td>12,080</td>
                                            <td>$93</td>
                                            <td><strong>$17,700</strong></td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <h6>Oreo 2.2</h6>
                                                <span>ThemeMakker To By Again</span>
                                            </td>
                                            <td>
                                                <ul class="list-unstyled team-info">
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                    <li><img src="${avatar2Jpg}" alt="Avatar"></li>
                                                </ul>
                                            </td>
                                            <td>
                                                <div class="sparkline text-left" data-type="line" data-width="8em" data-height="20px" data-line-Width="1.5" data-line-Color="#2d342e"
                                                data-fill-Color="transparent">3,1,2,5,4,6,2,3</div>
                                            </td>
                                            <td>18,200</td>
                                            <td>$178</td>
                                            <td><strong>$17,700</strong></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-12">
                    <div class="row">
                        <div class="col-lg-12 col-md-6">
                            <div class="card">
                                <div class="header">
                                    <h2>Income Analysis<small>8% High then last month</small></h2>
                                </div>
                                <div class="body">
                                    <div class="sparkline-pie text-center">6,4,8</div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-12 col-md-6">
                            <div class="card">
                                <div class="header">
                                    <h2>Sales Income</h2>
                                </div>
                                <div class="body">
                                    <h6>Overall <b class="text-success">7,000</b></h6>
                                    <div class="sparkline" data-type="line" data-spot-Radius="2" data-highlight-Spot-Color="#445771" data-highlight-Line-Color="#222"
                                        data-min-Spot-Color="#445771" data-max-Spot-Color="#445771" data-spot-Color="#445771"
                                        data-offset="90" data-width="100%" data-height="40px" data-line-Width="1" data-line-Color="#ffcd55"
                                        data-fill-Color="#ffcd55">2,4,3,1,5,7,3,2</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            
        </div>
    </div>
    
</div>

<!-- Javascript -->
<%@include file="include/footerScript.jsp" %>
</body>

<!-- Mirrored from thememakker.com/templates/lucid/hr/html/light/index2.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 20 Oct 2018 05:27:20 GMT -->
</html>
