---
title: "androidEnterpriseWiFiConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidEnterpriseWiFiConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [androidWiFiConfiguration](../resources/androidwificonfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidEnterpriseWiFiConfigurations](../api/androidenterprisewificonfiguration-list.md)|[androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md) collection|Get a list of the [androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md) objects and their properties.|
|[Create androidEnterpriseWiFiConfiguration](../api/androidenterprisewificonfiguration-create.md)|[androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md)|Create a new [androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md) object.|
|[Get androidEnterpriseWiFiConfiguration](../api/androidenterprisewificonfiguration-get.md)|[androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md)|Read the properties and relationships of an [androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md) object.|
|[Update androidEnterpriseWiFiConfiguration](../api/androidenterprisewificonfiguration-update.md)|[androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md)|Update the properties of an [androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md) object.|
|[Delete androidEnterpriseWiFiConfiguration](../api/androidenterprisewificonfiguration-delete.md)|None|Deletes an [androidEnterpriseWiFiConfiguration](../resources/androidenterprisewificonfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|wiFiAuthenticationMethod|**TODO: Add Description**. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|connectAutomatically|Boolean|**TODO: Add Description** Inherited from [androidWiFiConfiguration](../resources/androidwificonfiguration.md).|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description** Inherited from [androidWiFiConfiguration](../resources/androidwificonfiguration.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|eapType|androidEapType|**TODO: Add Description**. Possible values are: `eapTls`, `eapTtls`, `peap`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|innerAuthenticationProtocolForEapTtls|nonEapAuthenticationMethodForEapTtlsType|**TODO: Add Description**. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|innerAuthenticationProtocolForPeap|nonEapAuthenticationMethodForPeap|**TODO: Add Description**. Possible values are: `none`, `microsoftChapVersionTwo`.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|networkName|String|**TODO: Add Description** Inherited from [androidWiFiConfiguration](../resources/androidwificonfiguration.md).|
|outerIdentityPrivacyTemporaryValue|String|**TODO: Add Description**|
|passwordFormatString|String|**TODO: Add Description**|
|preSharedKey|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|ssid|String|**TODO: Add Description** Inherited from [androidWiFiConfiguration](../resources/androidwificonfiguration.md).|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|trustedServerCertificateNames|String collection|**TODO: Add Description**|
|usernameFormatString|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|wiFiSecurityType|androidWiFiSecurityType|**TODO: Add Description** Inherited from [androidWiFiConfiguration](../resources/androidwificonfiguration.md). Possible values are: `open`, `wpaEnterprise`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md)|**TODO: Add Description**|
|rootCertificateForServerValidation|[androidTrustedRootCertificate](../resources/androidtrustedrootcertificate.md)|**TODO: Add Description**|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidEnterpriseWiFiConfiguration",
  "baseType": "microsoft.graph.androidWiFiConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidEnterpriseWiFiConfiguration",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "networkName": "String",
  "ssid": "String",
  "connectAutomatically": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "wiFiSecurityType": "String",
  "eapType": "String",
  "trustedServerCertificateNames": [
    "String"
  ],
  "authenticationMethod": "String",
  "innerAuthenticationProtocolForEapTtls": "String",
  "innerAuthenticationProtocolForPeap": "String",
  "outerIdentityPrivacyTemporaryValue": "String",
  "usernameFormatString": "String",
  "passwordFormatString": "String",
  "preSharedKey": "String"
}
```

