---
title: "deviceManagement resource type"
description: "Singleton entity that acts as a container for all device management functionality."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Singleton entity that acts as a container for all device management functionality.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceManagement](../api/devicemanagement-get.md)|[deviceManagement](../resources/devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/devicemanagement.md) object.|
|[Update deviceManagement](../api/devicemanagement-update.md)|[deviceManagement](../resources/devicemanagement.md)|Update the properties of a [deviceManagement](../resources/devicemanagement.md) object.|
|[sendCustomNotificationToCompanyPortal](../api/devicemanagement-sendcustomnotificationtocompanyportal.md)|None|**TODO: Add Description**|
|[userExperienceAnalyticsSummarizeWorkFromAnywhereDevices](../api/devicemanagement-userexperienceanalyticssummarizeworkfromanywheredevices.md)|[userExperienceAnalyticsWorkFromAnywhereDevicesSummary](../resources/userexperienceanalyticsworkfromanywheredevicessummary.md)|**TODO: Add Description**|
|[getComanagedDevicesSummary](../api/devicemanagement-getcomanageddevicessummary.md)|[comanagedDevicesSummary](../resources/comanageddevicessummary.md)|**TODO: Add Description**|
|[getComanagementEligibleDevicesSummary](../api/devicemanagement-getcomanagementeligibledevicessummary.md)|[comanagementEligibleDevicesSummary](../resources/comanagementeligibledevicessummary.md)|**TODO: Add Description**|
|[List applePushNotificationCertificate](../api/devicemanagement-list-applepushnotificationcertificate.md)|[applePushNotificationCertificate](../resources/applepushnotificationcertificate.md) collection|Get the applePushNotificationCertificate resources from the applePushNotificationCertificate navigation property.|
|[Create applePushNotificationCertificate](../api/devicemanagement-post-applepushnotificationcertificate.md)|[applePushNotificationCertificate](../resources/applepushnotificationcertificate.md)|Create a new applePushNotificationCertificate object.|
|[List cloudPCConnectivityIssues](../api/devicemanagement-list-cloudpcconnectivityissues.md)|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) collection|Get the cloudPCConnectivityIssue resources from the cloudPCConnectivityIssues navigation property.|
|[Create cloudPCConnectivityIssue](../api/devicemanagement-post-cloudpcconnectivityissues.md)|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md)|Create a new cloudPCConnectivityIssue object.|
|[List comanagedDevices](../api/devicemanagement-list-comanageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the comanagedDevices navigation property.|
|[Create managedDevice](../api/devicemanagement-post-comanageddevices.md)|[managedDevice](../resources/manageddevice.md)|Create a new managedDevice object.|
|[List comanagementEligibleDevices](../api/devicemanagement-list-comanagementeligibledevices.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md) collection|Get the comanagementEligibleDevice resources from the comanagementEligibleDevices navigation property.|
|[Create comanagementEligibleDevice](../api/devicemanagement-post-comanagementeligibledevices.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md)|Create a new comanagementEligibleDevice object.|
|[List dataSharingConsents](../api/devicemanagement-list-datasharingconsents.md)|[dataSharingConsent](../resources/datasharingconsent.md) collection|Get the dataSharingConsent resources from the dataSharingConsents navigation property.|
|[Create dataSharingConsent](../api/devicemanagement-post-datasharingconsents.md)|[dataSharingConsent](../resources/datasharingconsent.md)|Create a new dataSharingConsent object.|
|[List detectedApps](../api/devicemanagement-list-detectedapps.md)|[detectedApp](../resources/detectedapp.md) collection|Get the detectedApp resources from the detectedApps navigation property.|
|[Create detectedApp](../api/devicemanagement-post-detectedapps.md)|[detectedApp](../resources/detectedapp.md)|Create a new detectedApp object.|
|[List deviceComplianceScripts](../api/devicemanagement-list-devicecompliancescripts.md)|[deviceComplianceScript](../resources/devicecompliancescript.md) collection|Get the deviceComplianceScript resources from the deviceComplianceScripts navigation property.|
|[Create deviceComplianceScript](../api/devicemanagement-post-devicecompliancescripts.md)|[deviceComplianceScript](../resources/devicecompliancescript.md)|Create a new deviceComplianceScript object.|
|[List deviceCustomAttributeShellScripts](../api/devicemanagement-list-devicecustomattributeshellscripts.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) collection|Get the deviceCustomAttributeShellScript resources from the deviceCustomAttributeShellScripts navigation property.|
|[Create deviceCustomAttributeShellScript](../api/devicemanagement-post-devicecustomattributeshellscripts.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md)|Create a new deviceCustomAttributeShellScript object.|
|[List deviceHealthScripts](../api/devicemanagement-list-devicehealthscripts.md)|[deviceHealthScript](../resources/devicehealthscript.md) collection|Get the deviceHealthScript resources from the deviceHealthScripts navigation property.|
|[Create deviceHealthScript](../api/devicemanagement-post-devicehealthscripts.md)|[deviceHealthScript](../resources/devicehealthscript.md)|Create a new deviceHealthScript object.|
|[List deviceManagementScripts](../api/devicemanagement-list-devicemanagementscripts.md)|[deviceManagementScript](../resources/devicemanagementscript.md) collection|Get the deviceManagementScript resources from the deviceManagementScripts navigation property.|
|[Create deviceManagementScript](../api/devicemanagement-post-devicemanagementscripts.md)|[deviceManagementScript](../resources/devicemanagementscript.md)|Create a new deviceManagementScript object.|
|[List deviceShellScripts](../api/devicemanagement-list-deviceshellscripts.md)|[deviceShellScript](../resources/deviceshellscript.md) collection|Get the deviceShellScript resources from the deviceShellScripts navigation property.|
|[Create deviceShellScript](../api/devicemanagement-post-deviceshellscripts.md)|[deviceShellScript](../resources/deviceshellscript.md)|Create a new deviceShellScript object.|
|[List managedDeviceOverview](../api/devicemanagement-list-manageddeviceoverview.md)|[managedDeviceOverview](../resources/manageddeviceoverview.md) collection|Get the managedDeviceOverview resources from the managedDeviceOverview navigation property.|
|[Add managedDeviceOverview](../api/devicemanagement-post-manageddeviceoverview.md)|[managedDeviceOverview](../resources/manageddeviceoverview.md)|Add managedDeviceOverview by posting to the managedDeviceOverview collection.|
|[List managedDevices](../api/devicemanagement-list-manageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the managedDevices navigation property.|
|[Create managedDevice](../api/devicemanagement-post-manageddevices.md)|[managedDevice](../resources/manageddevice.md)|Create a new managedDevice object.|
|[List mobileAppTroubleshootingEvents](../api/devicemanagement-list-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|Get the mobileAppTroubleshootingEvent resources from the mobileAppTroubleshootingEvents navigation property.|
|[Create mobileAppTroubleshootingEvent](../api/devicemanagement-post-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Create a new mobileAppTroubleshootingEvent object.|
|[List remoteActionAudits](../api/devicemanagement-list-remoteactionaudits.md)|[remoteActionAudit](../resources/remoteactionaudit.md) collection|Get the remoteActionAudit resources from the remoteActionAudits navigation property.|
|[Create remoteActionAudit](../api/devicemanagement-post-remoteactionaudits.md)|[remoteActionAudit](../resources/remoteactionaudit.md)|Create a new remoteActionAudit object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformance.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md) collection|Get the userExperienceAnalyticsAppHealthApplicationPerformance resources from the userExperienceAnalyticsAppHealthApplicationPerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthApplicationPerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformance.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md)|Create a new userExperienceAnalyticsAppHealthApplicationPerformance object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformancebyappversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) collection|Get the userExperienceAnalyticsAppHealthAppPerformanceByAppVersion resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion navigation property.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformancebyappversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md)|Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformancebyappversiondetails.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) collection|Get the userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails navigation property.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformancebyappversiondetails.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformancebyappversiondeviceid.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) collection|Get the userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId navigation property.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformancebyappversiondeviceid.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformancebyosversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) collection|Get the userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion navigation property.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformancebyosversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md)|Create a new userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object.|
|[List userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthdevicemodelperformance.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) collection|Get the userExperienceAnalyticsAppHealthDeviceModelPerformance resources from the userExperienceAnalyticsAppHealthDeviceModelPerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthdevicemodelperformance.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md)|Create a new userExperienceAnalyticsAppHealthDeviceModelPerformance object.|
|[List userExperienceAnalyticsAppHealthDevicePerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthdeviceperformance.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) collection|Get the userExperienceAnalyticsAppHealthDevicePerformance resources from the userExperienceAnalyticsAppHealthDevicePerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthDevicePerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthdeviceperformance.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md)|Create a new userExperienceAnalyticsAppHealthDevicePerformance object.|
|[List userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/devicemanagement-list-userexperienceanalyticsapphealthdeviceperformancedetails.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) collection|Get the userExperienceAnalyticsAppHealthDevicePerformanceDetails resources from the userExperienceAnalyticsAppHealthDevicePerformanceDetails navigation property.|
|[Create userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/devicemanagement-post-userexperienceanalyticsapphealthdeviceperformancedetails.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md)|Create a new userExperienceAnalyticsAppHealthDevicePerformanceDetails object.|
|[List userExperienceAnalyticsAppHealthOSVersionPerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthosversionperformance.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) collection|Get the userExperienceAnalyticsAppHealthOSVersionPerformance resources from the userExperienceAnalyticsAppHealthOSVersionPerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthOSVersionPerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthosversionperformance.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md)|Create a new userExperienceAnalyticsAppHealthOSVersionPerformance object.|
|[List userExperienceAnalyticsCategory](../api/devicemanagement-list-userexperienceanalyticsapphealthoverview.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) collection|Get the userExperienceAnalyticsCategory resources from the userExperienceAnalyticsAppHealthOverview navigation property.|
|[Create userExperienceAnalyticsCategory](../api/devicemanagement-post-userexperienceanalyticsapphealthoverview.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md)|Create a new userExperienceAnalyticsCategory object.|
|[List userExperienceAnalyticsBaselines](../api/devicemanagement-list-userexperienceanalyticsbaselines.md)|[userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md) collection|Get the userExperienceAnalyticsBaseline resources from the userExperienceAnalyticsBaselines navigation property.|
|[Create userExperienceAnalyticsBaseline](../api/devicemanagement-post-userexperienceanalyticsbaselines.md)|[userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md)|Create a new userExperienceAnalyticsBaseline object.|
|[List userExperienceAnalyticsCategories](../api/devicemanagement-list-userexperienceanalyticscategories.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) collection|Get the userExperienceAnalyticsCategory resources from the userExperienceAnalyticsCategories navigation property.|
|[Create userExperienceAnalyticsCategory](../api/devicemanagement-post-userexperienceanalyticscategories.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md)|Create a new userExperienceAnalyticsCategory object.|
|[List userExperienceAnalyticsDeviceMetricHistory](../api/devicemanagement-list-userexperienceanalyticsdevicemetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|Get the userExperienceAnalyticsMetricHistory resources from the userExperienceAnalyticsDeviceMetricHistory navigation property.|
|[Create userExperienceAnalyticsMetricHistory](../api/devicemanagement-post-userexperienceanalyticsdevicemetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Create a new userExperienceAnalyticsMetricHistory object.|
|[List userExperienceAnalyticsDevicePerformance](../api/devicemanagement-list-userexperienceanalyticsdeviceperformance.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) collection|Get the userExperienceAnalyticsDevicePerformance resources from the userExperienceAnalyticsDevicePerformance navigation property.|
|[Create userExperienceAnalyticsDevicePerformance](../api/devicemanagement-post-userexperienceanalyticsdeviceperformance.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md)|Create a new userExperienceAnalyticsDevicePerformance object.|
|[List userExperienceAnalyticsDeviceScores](../api/devicemanagement-list-userexperienceanalyticsdevicescores.md)|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) collection|Get the userExperienceAnalyticsDeviceScores resources from the userExperienceAnalyticsDeviceScores navigation property.|
|[Create userExperienceAnalyticsDeviceScores](../api/devicemanagement-post-userexperienceanalyticsdevicescores.md)|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md)|Create a new userExperienceAnalyticsDeviceScores object.|
|[List userExperienceAnalyticsDeviceStartupHistory](../api/devicemanagement-list-userexperienceanalyticsdevicestartuphistory.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) collection|Get the userExperienceAnalyticsDeviceStartupHistory resources from the userExperienceAnalyticsDeviceStartupHistory navigation property.|
|[Create userExperienceAnalyticsDeviceStartupHistory](../api/devicemanagement-post-userexperienceanalyticsdevicestartuphistory.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md)|Create a new userExperienceAnalyticsDeviceStartupHistory object.|
|[List userExperienceAnalyticsDeviceStartupProcesses](../api/devicemanagement-list-userexperienceanalyticsdevicestartupprocesses.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) collection|Get the userExperienceAnalyticsDeviceStartupProcess resources from the userExperienceAnalyticsDeviceStartupProcesses navigation property.|
|[Create userExperienceAnalyticsDeviceStartupProcess](../api/devicemanagement-post-userexperienceanalyticsdevicestartupprocesses.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md)|Create a new userExperienceAnalyticsDeviceStartupProcess object.|
|[List userExperienceAnalyticsDeviceStartupProcessPerformance](../api/devicemanagement-list-userexperienceanalyticsdevicestartupprocessperformance.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) collection|Get the userExperienceAnalyticsDeviceStartupProcessPerformance resources from the userExperienceAnalyticsDeviceStartupProcessPerformance navigation property.|
|[Create userExperienceAnalyticsDeviceStartupProcessPerformance](../api/devicemanagement-post-userexperienceanalyticsdevicestartupprocessperformance.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md)|Create a new userExperienceAnalyticsDeviceStartupProcessPerformance object.|
|[List userExperienceAnalyticsDevicesWithoutCloudIdentity](../api/devicemanagement-list-userexperienceanalyticsdeviceswithoutcloudidentity.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) collection|Get the userExperienceAnalyticsDeviceWithoutCloudIdentity resources from the userExperienceAnalyticsDevicesWithoutCloudIdentity navigation property.|
|[Create userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/devicemanagement-post-userexperienceanalyticsdeviceswithoutcloudidentity.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md)|Create a new userExperienceAnalyticsDeviceWithoutCloudIdentity object.|
|[List userExperienceAnalyticsImpactingProcess](../api/devicemanagement-list-userexperienceanalyticsimpactingprocess.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) collection|Get the userExperienceAnalyticsImpactingProcess resources from the userExperienceAnalyticsImpactingProcess navigation property.|
|[Create userExperienceAnalyticsImpactingProcess](../api/devicemanagement-post-userexperienceanalyticsimpactingprocess.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md)|Create a new userExperienceAnalyticsImpactingProcess object.|
|[List userExperienceAnalyticsMetricHistory](../api/devicemanagement-list-userexperienceanalyticsmetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|Get the userExperienceAnalyticsMetricHistory resources from the userExperienceAnalyticsMetricHistory navigation property.|
|[Create userExperienceAnalyticsMetricHistory](../api/devicemanagement-post-userexperienceanalyticsmetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Create a new userExperienceAnalyticsMetricHistory object.|
|[List userExperienceAnalyticsNotAutopilotReadyDevice](../api/devicemanagement-list-userexperienceanalyticsnotautopilotreadydevice.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) collection|Get the userExperienceAnalyticsNotAutopilotReadyDevice resources from the userExperienceAnalyticsNotAutopilotReadyDevice navigation property.|
|[Create userExperienceAnalyticsNotAutopilotReadyDevice](../api/devicemanagement-post-userexperienceanalyticsnotautopilotreadydevice.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md)|Create a new userExperienceAnalyticsNotAutopilotReadyDevice object.|
|[List userExperienceAnalyticsOverview](../api/devicemanagement-list-userexperienceanalyticsoverview.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) collection|Get the userExperienceAnalyticsOverview resources from the userExperienceAnalyticsOverview navigation property.|
|[Create userExperienceAnalyticsOverview](../api/devicemanagement-post-userexperienceanalyticsoverview.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|Create a new userExperienceAnalyticsOverview object.|
|[List userExperienceAnalyticsRegressionSummary](../api/devicemanagement-list-userexperienceanalyticsregressionsummary.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) collection|Get the userExperienceAnalyticsRegressionSummary resources from the userExperienceAnalyticsRegressionSummary navigation property.|
|[Create userExperienceAnalyticsRegressionSummary](../api/devicemanagement-post-userexperienceanalyticsregressionsummary.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|Create a new userExperienceAnalyticsRegressionSummary object.|
|[List userExperienceAnalyticsRemoteConnection](../api/devicemanagement-list-userexperienceanalyticsremoteconnection.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) collection|Get the userExperienceAnalyticsRemoteConnection resources from the userExperienceAnalyticsRemoteConnection navigation property.|
|[Create userExperienceAnalyticsRemoteConnection](../api/devicemanagement-post-userexperienceanalyticsremoteconnection.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md)|Create a new userExperienceAnalyticsRemoteConnection object.|
|[List userExperienceAnalyticsResourcePerformance](../api/devicemanagement-list-userexperienceanalyticsresourceperformance.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) collection|Get the userExperienceAnalyticsResourcePerformance resources from the userExperienceAnalyticsResourcePerformance navigation property.|
|[Create userExperienceAnalyticsResourcePerformance](../api/devicemanagement-post-userexperienceanalyticsresourceperformance.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md)|Create a new userExperienceAnalyticsResourcePerformance object.|
|[List userExperienceAnalyticsScoreHistory](../api/devicemanagement-list-userexperienceanalyticsscorehistory.md)|[userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) collection|Get the userExperienceAnalyticsScoreHistory resources from the userExperienceAnalyticsScoreHistory navigation property.|
|[Create userExperienceAnalyticsScoreHistory](../api/devicemanagement-post-userexperienceanalyticsscorehistory.md)|[userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md)|Create a new userExperienceAnalyticsScoreHistory object.|
|[List userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/devicemanagement-list-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) collection|Get the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric resources from the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric navigation property.|
|[Create userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/devicemanagement-post-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Create a new userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric object.|
|[List userExperienceAnalyticsWorkFromAnywhereMetrics](../api/devicemanagement-list-userexperienceanalyticsworkfromanywheremetrics.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) collection|Get the userExperienceAnalyticsWorkFromAnywhereMetric resources from the userExperienceAnalyticsWorkFromAnywhereMetrics navigation property.|
|[Create userExperienceAnalyticsWorkFromAnywhereMetric](../api/devicemanagement-post-userexperienceanalyticsworkfromanywheremetrics.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md)|Create a new userExperienceAnalyticsWorkFromAnywhereMetric object.|
|[List windowsMalwareInformation](../api/devicemanagement-list-windowsmalwareinformation.md)|[windowsMalwareInformation](../resources/windowsmalwareinformation.md) collection|Get the windowsMalwareInformation resources from the windowsMalwareInformation navigation property.|
|[Create windowsMalwareInformation](../api/devicemanagement-post-windowsmalwareinformation.md)|[windowsMalwareInformation](../resources/windowsmalwareinformation.md)|Create a new windowsMalwareInformation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountMoveCompletionDateTime|DateTimeOffset|The date & time when tenant data moved between scaleunits.|
|adminConsent|[adminConsent](../resources/adminconsent.md)|Admin consent information.|
|deviceProtectionOverview|[deviceProtectionOverview](../resources/deviceprotectionoverview.md)|Device protection overview.|
|id|String|Unique Identifier for the device|
|managedDeviceCleanupSettings|[managedDeviceCleanupSettings](../resources/manageddevicecleanupsettings.md)|Device cleanup rule|
|subscriptions|deviceManagementSubscriptions|Tenant's Subscription. Possible values are: `none`, `intune`, `office365`, `intunePremium`, `intune_EDU`, `intune_SMB`.|
|subscriptionState|deviceManagementSubscriptionState|Tenant mobile device management subscription state. Possible values are: `pending`, `active`, `warning`, `disabled`, `deleted`, `blocked`, `lockedOut`.|
|userExperienceAnalyticsSettings|[userExperienceAnalyticsSettings](../resources/userexperienceanalyticssettings.md)|User experience analytics device settings|
|windowsMalwareOverview|[windowsMalwareOverview](../resources/windowsmalwareoverview.md)|Malware overview for windows devices.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|applePushNotificationCertificate|[applePushNotificationCertificate](../resources/applepushnotificationcertificate.md)|Apple push notification certificate.|
|cloudPCConnectivityIssues|[cloudPCConnectivityIssue](../resources/cloudpcconnectivityissue.md) collection|The list of CloudPC Connectivity Issue.|
|comanagedDevices|[managedDevice](../resources/manageddevice.md) collection|The list of co-managed devices report|
|comanagementEligibleDevices|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md) collection|The list of co-management eligible devices report|
|dataSharingConsents|[dataSharingConsent](../resources/datasharingconsent.md) collection|Data sharing consents.|
|detectedApps|[detectedApp](../resources/detectedapp.md) collection|The list of detected apps associated with a device.|
|deviceComplianceScripts|[deviceComplianceScript](../resources/devicecompliancescript.md) collection|The list of device compliance scripts associated with the tenant.|
|deviceCustomAttributeShellScripts|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) collection|The list of device custom attribute shell scripts associated with the tenant.|
|deviceHealthScripts|[deviceHealthScript](../resources/devicehealthscript.md) collection|The list of device health scripts associated with the tenant.|
|deviceManagementScripts|[deviceManagementScript](../resources/devicemanagementscript.md) collection|The list of device management scripts associated with the tenant.|
|deviceShellScripts|[deviceShellScript](../resources/deviceshellscript.md) collection|The list of device shell scripts associated with the tenant.|
|managedDeviceOverview|[managedDeviceOverview](../resources/manageddeviceoverview.md)|Device overview|
|managedDevices|[managedDevice](../resources/manageddevice.md) collection|The list of managed devices.|
|mobileAppTroubleshootingEvents|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|The collection property of MobileAppTroubleshootingEvent.|
|remoteActionAudits|[remoteActionAudit](../resources/remoteactionaudit.md) collection|The list of device remote action audits with the tenant.|
|userExperienceAnalyticsAppHealthApplicationPerformance|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md) collection|User experience analytics appHealth Application Performance|
|userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) collection|User experience analytics appHealth Application Performance by App Version|
|userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) collection|User experience analytics appHealth Application Performance by App Version details|
|userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) collection|User experience analytics appHealth Application Performance by App Version Device Id|
|userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) collection|User experience analytics appHealth Application Performance by OS Version|
|userExperienceAnalyticsAppHealthDeviceModelPerformance|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) collection|User experience analytics appHealth Model Performance|
|userExperienceAnalyticsAppHealthDevicePerformance|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) collection|User experience analytics appHealth Device Performance|
|userExperienceAnalyticsAppHealthDevicePerformanceDetails|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) collection|User experience analytics device performance details|
|userExperienceAnalyticsAppHealthOSVersionPerformance|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) collection|User experience analytics appHealth OS version Performance|
|userExperienceAnalyticsAppHealthOverview|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md)|User experience analytics appHealth overview|
|userExperienceAnalyticsBaselines|[userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md) collection|User experience analytics baselines|
|userExperienceAnalyticsCategories|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) collection|User experience analytics categories|
|userExperienceAnalyticsDeviceMetricHistory|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|User experience analytics device metric history|
|userExperienceAnalyticsDevicePerformance|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) collection|User experience analytics device performance|
|userExperienceAnalyticsDeviceScores|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) collection|User experience analytics device scores|
|userExperienceAnalyticsDeviceStartupHistory|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) collection|User experience analytics device Startup History|
|userExperienceAnalyticsDeviceStartupProcesses|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) collection|User experience analytics device Startup Processes|
|userExperienceAnalyticsDeviceStartupProcessPerformance|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) collection|User experience analytics device Startup Process Performance|
|userExperienceAnalyticsDevicesWithoutCloudIdentity|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) collection|User experience analytics devices without cloud identity.|
|userExperienceAnalyticsImpactingProcess|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) collection|User experience analytics impacting process|
|userExperienceAnalyticsMetricHistory|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|User experience analytics metric history|
|userExperienceAnalyticsNotAutopilotReadyDevice|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) collection|User experience analytics devices not Windows Autopilot ready.|
|userExperienceAnalyticsOverview|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|User experience analytics overview|
|userExperienceAnalyticsRegressionSummary|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|User experience analytics regression summary|
|userExperienceAnalyticsRemoteConnection|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) collection|User experience analytics remote connection|
|userExperienceAnalyticsResourcePerformance|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) collection|User experience analytics resource performance|
|userExperienceAnalyticsScoreHistory|[userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) collection|User experience analytics device Startup Score History|
|userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|User experience analytics work from anywhere hardware readiness metrics.|
|userExperienceAnalyticsWorkFromAnywhereMetrics|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) collection|User experience analytics work from anywhere metrics.|
|windowsMalwareInformation|[windowsMalwareInformation](../resources/windowsmalwareinformation.md) collection|The list of affected malware in the tenant.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)",
  "subscriptionState": "String",
  "subscriptions": "String",
  "managedDeviceCleanupSettings": {
    "@odata.type": "microsoft.graph.managedDeviceCleanupSettings"
  },
  "adminConsent": {
    "@odata.type": "microsoft.graph.adminConsent"
  },
  "deviceProtectionOverview": {
    "@odata.type": "microsoft.graph.deviceProtectionOverview"
  },
  "windowsMalwareOverview": {
    "@odata.type": "microsoft.graph.windowsMalwareOverview"
  },
  "accountMoveCompletionDateTime": "String (timestamp)",
  "userExperienceAnalyticsSettings": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsSettings"
  }
}
```

