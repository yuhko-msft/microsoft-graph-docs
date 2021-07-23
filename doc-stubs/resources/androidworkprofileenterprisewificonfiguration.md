---
title: "androidWorkProfileEnterpriseWiFiConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidWorkProfileEnterpriseWiFiConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidWorkProfileEnterpriseWiFiConfigurations](../api/androidworkprofileenterprisewificonfiguration-list.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) collection|Get a list of the [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) objects and their properties.|
|[Create androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-create.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md)|Create a new [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[Get androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-get.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md)|Read the properties and relationships of an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[Update androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-update.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md)|Update the properties of an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[Delete androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-delete.md)|None|Deletes an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|wiFiAuthenticationMethod|**TODO: Add Description**. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|connectAutomatically|Boolean|**TODO: Add Description** Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md).|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description** Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md).|
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
|networkName|String|**TODO: Add Description** Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md).|
|outerIdentityPrivacyTemporaryValue|String|**TODO: Add Description**|
|proxyAutomaticConfigurationUrl|String|**TODO: Add Description**|
|proxySettings|wiFiProxySetting|**TODO: Add Description**. Possible values are: `none`, `manual`, `automatic`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|ssid|String|**TODO: Add Description** Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md).|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|trustedServerCertificateNames|String collection|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|wiFiSecurityType|androidWiFiSecurityType|**TODO: Add Description** Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md). Possible values are: `open`, `wpaEnterprise`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md)|**TODO: Add Description**|
|rootCertificateForServerValidation|[androidWorkProfileTrustedRootCertificate](../resources/androidworkprofiletrustedrootcertificate.md)|**TODO: Add Description**|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration",
  "baseType": "microsoft.graph.androidWorkProfileWiFiConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration",
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
  "proxySettings": "String",
  "proxyAutomaticConfigurationUrl": "String"
}
```

