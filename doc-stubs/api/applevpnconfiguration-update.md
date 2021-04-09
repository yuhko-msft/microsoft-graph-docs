---
title: "Update appleVpnConfiguration"
description: "Update the properties of an appleVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update appleVpnConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [appleVpnConfiguration](../resources/applevpnconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH ** Entity URI for microsoft.graph.appleVpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [appleVpnConfiguration](../resources/applevpnconfiguration.md) object.

The following table shows the properties that are required when you update the [appleVpnConfiguration](../resources/applevpnconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|connectionName|String|**TODO: Add Description**|
|connectionType|appleVpnConnectionType|**TODO: Add Description**. Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `customVpn`, `ciscoIPSec`, `citrix`, `ciscoAnyConnectV2`, `paloAltoGlobalProtect`, `zscalerPrivateAccess`, `f5Access2018`, `citrixSso`, `paloAltoGlobalProtectV2`, `ikEv2`, `alwaysOn`, `microsoftTunnel`, `netMotionMobility`, `microsoftProtect`.|
|loginGroupOrDomain|String|**TODO: Add Description**|
|role|String|**TODO: Add Description**|
|realm|String|**TODO: Add Description**|
|server|[vpnServer](../resources/intune-vpnserver.md)|**TODO: Add Description**|
|identifier|String|**TODO: Add Description**|
|customData|[keyValue](../resources/intune-keyvalue.md) collection|**TODO: Add Description**|
|customKeyValueData|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|enableSplitTunneling|Boolean|**TODO: Add Description**|
|authenticationMethod|vpnAuthenticationMethod|**TODO: Add Description**. Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|enablePerApp|Boolean|**TODO: Add Description**|
|safariDomains|String collection|**TODO: Add Description**|
|onDemandRules|[vpnOnDemandRule](../resources/intune-vpnondemandrule.md) collection|**TODO: Add Description**|
|providerType|vpnProviderType|**TODO: Add Description**. Possible values are: `notConfigured`, `appProxy`, `packetTunnel`.|
|associatedDomains|String collection|**TODO: Add Description**|
|excludedDomains|String collection|**TODO: Add Description**|
|disableOnDemandUserOverride|Boolean|**TODO: Add Description**|
|disconnectOnIdle|Boolean|**TODO: Add Description**|
|disconnectOnIdleTimerInSeconds|Int32|**TODO: Add Description**|
|proxyServer|[vpnProxyServer](../resources/intune-vpnproxyserver.md)|**TODO: Add Description**|
|optInToDeviceIdSharing|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [appleVpnConfiguration](../resources/applevpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_applevpnconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.appleVpnConfiguration not found
Content-Type: application/json
Content-length: 1673

{
  "@odata.type": "#microsoft.graph.appleVpnConfiguration",
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
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "connectionName": "String",
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "role": "String",
  "realm": "String",
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  },
  "identifier": "String",
  "customData": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "customKeyValueData": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "enableSplitTunneling": "Boolean",
  "authenticationMethod": "String",
  "enablePerApp": "Boolean",
  "safariDomains": [
    "String"
  ],
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "providerType": "String",
  "associatedDomains": [
    "String"
  ],
  "excludedDomains": [
    "String"
  ],
  "disableOnDemandUserOverride": "Boolean",
  "disconnectOnIdle": "Boolean",
  "disconnectOnIdleTimerInSeconds": "Integer",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "optInToDeviceIdSharing": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.appleVpnConfiguration",
  "id": "9e97ccd8-ccd8-9e97-d8cc-979ed8cc979e",
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
  "connectionName": "String",
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "role": "String",
  "realm": "String",
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  },
  "identifier": "String",
  "customData": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "customKeyValueData": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "enableSplitTunneling": "Boolean",
  "authenticationMethod": "String",
  "enablePerApp": "Boolean",
  "safariDomains": [
    "String"
  ],
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "providerType": "String",
  "associatedDomains": [
    "String"
  ],
  "excludedDomains": [
    "String"
  ],
  "disableOnDemandUserOverride": "Boolean",
  "disconnectOnIdle": "Boolean",
  "disconnectOnIdleTimerInSeconds": "Integer",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "optInToDeviceIdSharing": "Boolean"
}
```

