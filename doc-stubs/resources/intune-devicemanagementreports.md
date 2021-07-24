---
title: "deviceManagementReports resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementReports resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementReports](../api/intune-devicemanagementreports-list.md)|[deviceManagementReports](../resources/intune-devicemanagementreports.md) collection|Get a list of the [deviceManagementReports](../resources/intune-devicemanagementreports.md) objects and their properties.|
|[Create deviceManagementReports](../api/intune-devicemanagementreports-create.md)|[deviceManagementReports](../resources/intune-devicemanagementreports.md)|Create a new [deviceManagementReports](../resources/intune-devicemanagementreports.md) object.|
|[Get deviceManagementReports](../api/intune-devicemanagementreports-get.md)|[deviceManagementReports](../resources/intune-devicemanagementreports.md)|Read the properties and relationships of a [deviceManagementReports](../resources/intune-devicemanagementreports.md) object.|
|[Update deviceManagementReports](../api/intune-devicemanagementreports-update.md)|[deviceManagementReports](../resources/intune-devicemanagementreports.md)|Update the properties of a [deviceManagementReports](../resources/intune-devicemanagementreports.md) object.|
|[Delete deviceManagementReports](../api/intune-devicemanagementreports-delete.md)|None|Deletes a [deviceManagementReports](../resources/intune-devicemanagementreports.md) object.|
|[getDeviceNonComplianceReport](../api/intune-devicemanagementreports-getdevicenoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getPolicyNonComplianceReport](../api/intune-devicemanagementreports-getpolicynoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getPolicyNonComplianceMetadata](../api/intune-devicemanagementreports-getpolicynoncompliancemetadata.md)|Stream|**TODO: Add Description**|
|[getPolicyNonComplianceSummaryReport](../api/intune-devicemanagementreports-getpolicynoncompliancesummaryreport.md)|Stream|**TODO: Add Description**|
|[getSettingNonComplianceReport](../api/intune-devicemanagementreports-getsettingnoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getReportFilters](../api/intune-devicemanagementreports-getreportfilters.md)|Stream|**TODO: Add Description**|
|[getHistoricalReport](../api/intune-devicemanagementreports-gethistoricalreport.md)|Stream|**TODO: Add Description**|
|[getConfigurationPolicyNonComplianceSummaryReport](../api/intune-devicemanagementreports-getconfigurationpolicynoncompliancesummaryreport.md)|Stream|**TODO: Add Description**|
|[getConfigurationPolicyNonComplianceReport](../api/intune-devicemanagementreports-getconfigurationpolicynoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getConfigurationSettingNonComplianceReport](../api/intune-devicemanagementreports-getconfigurationsettingnoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getDeviceManagementIntentSettingsReport](../api/intune-devicemanagementreports-getdevicemanagementintentsettingsreport.md)|Stream|**TODO: Add Description**|
|[getCompliancePolicyNonComplianceSummaryReport](../api/intune-devicemanagementreports-getcompliancepolicynoncompliancesummaryreport.md)|Stream|**TODO: Add Description**|
|[getCompliancePolicyNonComplianceReport](../api/intune-devicemanagementreports-getcompliancepolicynoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getComplianceSettingNonComplianceReport](../api/intune-devicemanagementreports-getcompliancesettingnoncompliancereport.md)|Stream|**TODO: Add Description**|
|[getCachedReport](../api/intune-devicemanagementreports-getcachedreport.md)|Stream|**TODO: Add Description**|
|[List exportJobs](../api/intune-devicemanagementreports-list-exportjobs.md)|[deviceManagementExportJob](../resources/intune-devicemanagementexportjob.md) collection|Get the deviceManagementExportJob resources from the exportJobs navigation property.|
|[Create deviceManagementExportJob](../api/intune-devicemanagementreports-post-exportjobs.md)|[deviceManagementExportJob](../resources/intune-devicemanagementexportjob.md)|Create a new deviceManagementExportJob object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|exportJobs|[deviceManagementExportJob](../resources/intune-devicemanagementexportjob.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementReports",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementReports",
  "id": "String (identifier)"
}
```

