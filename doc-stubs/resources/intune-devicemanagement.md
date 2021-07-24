---
title: "deviceManagement resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceManagement](../api/intune-devicemanagement-get.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[Update deviceManagement](../api/intune-devicemanagement-update.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Update the properties of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[List deviceManagementReports](../api/intune-devicemanagement-list-reports.md)|[deviceManagementReports](../resources/intune-devicemanagementreports.md) collection|Get the deviceManagementReports resources from the reports navigation property.|
|[Create deviceManagementReports](../api/intune-devicemanagement-post-reports.md)|[deviceManagementReports](../resources/intune-devicemanagementreports.md)|Create a new deviceManagementReports object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|intuneAccountId|Guid|**TODO: Add Description**|
|intuneBrand|[intuneBrand](../resources/intune-intunebrand.md)|**TODO: Add Description**|
|settings|[deviceManagementSettings](../resources/intune-devicemanagementsettings.md)|**TODO: Add Description**|
|subscriptionState|deviceManagementSubscriptionState|**TODO: Add Description**. Possible values are: `pending`, `active`, `warning`, `disabled`, `deleted`, `blocked`, `lockedOut`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|applePushNotificationCertificate|[applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md)|**TODO: Add Description**|
|complianceManagementPartners|[complianceManagementPartner](../resources/intune-compliancemanagementpartner.md) collection|**TODO: Add Description**|
|conditionalAccessSettings|[onPremisesConditionalAccessSettings](../resources/intune-onpremisesconditionalaccesssettings.md)|**TODO: Add Description**|
|detectedApps|[detectedApp](../resources/intune-detectedapp.md) collection|**TODO: Add Description**|
|deviceCategories|[deviceCategory](../resources/intune-devicecategory.md) collection|**TODO: Add Description**|
|deviceCompliancePolicies|[deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md) collection|**TODO: Add Description**|
|deviceCompliancePolicyDeviceStateSummary|[deviceCompliancePolicyDeviceStateSummary](../resources/intune-devicecompliancepolicydevicestatesummary.md)|**TODO: Add Description**|
|deviceCompliancePolicySettingStateSummaries|[deviceCompliancePolicySettingStateSummary](../resources/intune-devicecompliancepolicysettingstatesummary.md) collection|**TODO: Add Description**|
|deviceConfigurationDeviceStateSummaries|[deviceConfigurationDeviceStateSummary](../resources/intune-deviceconfigurationdevicestatesummary.md)|**TODO: Add Description**|
|deviceConfigurations|[deviceConfiguration](../resources/intune-deviceconfiguration.md) collection|**TODO: Add Description**|
|deviceEnrollmentConfigurations|[deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md) collection|**TODO: Add Description**|
|deviceManagementPartners|[deviceManagementPartner](../resources/intune-devicemanagementpartner.md) collection|**TODO: Add Description**|
|exchangeConnectors|[deviceManagementExchangeConnector](../resources/intune-devicemanagementexchangeconnector.md) collection|**TODO: Add Description**|
|importedWindowsAutopilotDeviceIdentities|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md) collection|**TODO: Add Description**|
|iosUpdateStatuses|[iosUpdateDeviceStatus](../resources/intune-iosupdatedevicestatus.md) collection|**TODO: Add Description**|
|managedDeviceOverview|[managedDeviceOverview](../resources/intune-manageddeviceoverview.md)|**TODO: Add Description**|
|managedDevices|[managedDevice](../resources/intune-manageddevice.md) collection|**TODO: Add Description**|
|mobileThreatDefenseConnectors|[mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) collection|**TODO: Add Description**|
|notificationMessageTemplates|[notificationMessageTemplate](../resources/intune-notificationmessagetemplate.md) collection|**TODO: Add Description**|
|remoteAssistancePartners|[remoteAssistancePartner](../resources/intune-remoteassistancepartner.md) collection|**TODO: Add Description**|
|reports|[deviceManagementReports](../resources/intune-devicemanagementreports.md)|**TODO: Add Description**|
|resourceOperations|[resourceOperation](../resources/intune-resourceoperation.md) collection|**TODO: Add Description**|
|roleAssignments|[deviceAndAppManagementRoleAssignment](../resources/intune-deviceandappmanagementroleassignment.md) collection|**TODO: Add Description**|
|roleDefinitions|[roleDefinition](../resources/intune-roledefinition.md) collection|**TODO: Add Description**|
|softwareUpdateStatusSummary|[softwareUpdateStatusSummary](../resources/intune-softwareupdatestatussummary.md)|**TODO: Add Description**|
|telecomExpenseManagementPartners|[telecomExpenseManagementPartner](../resources/intune-telecomexpensemanagementpartner.md) collection|**TODO: Add Description**|
|termsAndConditions|[termsAndConditions](../resources/intune-termsandconditions.md) collection|**TODO: Add Description**|
|troubleshootingEvents|[deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md) collection|**TODO: Add Description**|
|windowsAutopilotDeviceIdentities|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) collection|**TODO: Add Description**|
|windowsInformationProtectionAppLearningSummaries|[windowsInformationProtectionAppLearningSummary](../resources/intune-windowsinformationprotectionapplearningsummary.md) collection|**TODO: Add Description**|
|windowsInformationProtectionNetworkLearningSummaries|[windowsInformationProtectionNetworkLearningSummary](../resources/intune-windowsinformationprotectionnetworklearningsummary.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)",
  "settings": {
    "@odata.type": "microsoft.graph.deviceManagementSettings"
  },
  "intuneAccountId": "Guid",
  "intuneBrand": {
    "@odata.type": "microsoft.graph.intuneBrand"
  },
  "subscriptionState": "String"
}
```

