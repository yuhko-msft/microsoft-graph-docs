---
title: "iosIKEv2VpnConnectionSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosIKEv2VpnConnectionSettings resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnConnectionSettings](../resources/iosvpnconnectionsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|alwaysOnSettings|[iosVpnAlwaysOnSettings](../resources/intune-iosvpnalwaysonsettings.md)|**TODO: Add Description**|
|authenticationMethod|[resourceAccessAuthenticationMethod](../resources/intune-resourceaccessauthenticationmethod.md)|**TODO: Add Description**|
|certificateType|iosVpnCertificateType|**TODO: Add Description**. Possible values are: `rsa`, `ecdsa256`, `ecdsa384`, `ecdsa512`, `ed25519`.|
|childSecurityAssociationParameters|[iosVpnIKEv2SecurityAssociationParameters](../resources/intune-iosvpnikev2securityassociationparameters.md)|**TODO: Add Description**|
|clientAuthenticationType|vpnClientAuthenticationType|**TODO: Add Description**. Possible values are: `userAuthentication`, `deviceAuthentication`.|
|deadPeerDetectionRate|vpnDeadPeerDetectionRate|**TODO: Add Description**. Possible values are: `medium`, `none`, `low`, `high`.|
|disableMobilityAndMultihoming|Boolean|**TODO: Add Description**|
|disableRedirect|Boolean|**TODO: Add Description**|
|enableCertificateRevocationCheck|Boolean|**TODO: Add Description**|
|enablePerfectForwardSecrecy|Boolean|**TODO: Add Description**|
|enableUseInternalSubnetAttributes|Boolean|**TODO: Add Description**|
|localIdentifier|vpnLocalIdentifier|**TODO: Add Description**. Possible values are: `deviceFQDN`, `empty`, `clientCertificateSubjectName`.|
|mtuSizeInBytes|Int32|**TODO: Add Description**|
|remoteAddress|String|**TODO: Add Description**|
|remoteIdentifier|String|**TODO: Add Description**|
|securityAssociationParameters|[iosVpnIKEv2SecurityAssociationParameters](../resources/intune-iosvpnikev2securityassociationparameters.md)|**TODO: Add Description**|
|serverCertificateCommonName|String|**TODO: Add Description**|
|serverCertificateIssuerCommonName|String|**TODO: Add Description**|
|tlsMaximumVersion|tlsVersion|**TODO: Add Description**. Possible values are: `tlS1_0`, `tlS1_1`, `tlS1_2`.|
|tlsMinimumVersion|tlsVersion|**TODO: Add Description**. Possible values are: `tlS1_0`, `tlS1_1`, `tlS1_2`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosIKEv2VpnConnectionSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosIKEv2VpnConnectionSettings",
  "alwaysOnSettings": {
    "@odata.type": "microsoft.graph.iosVpnAlwaysOnSettings"
  },
  "authenticationMethod": {
    "@odata.type": "microsoft.graph.resourceAccessAuthenticationMethod"
  },
  "certificateType": "String",
  "childSecurityAssociationParameters": {
    "@odata.type": "microsoft.graph.iosVpnIKEv2SecurityAssociationParameters"
  },
  "clientAuthenticationType": "String",
  "deadPeerDetectionRate": "String",
  "disableMobilityAndMultihoming": "Boolean",
  "disableRedirect": "Boolean",
  "enableCertificateRevocationCheck": "Boolean",
  "enablePerfectForwardSecrecy": "Boolean",
  "enableUseInternalSubnetAttributes": "Boolean",
  "localIdentifier": "String",
  "mtuSizeInBytes": "Integer",
  "remoteAddress": "String",
  "remoteIdentifier": "String",
  "securityAssociationParameters": {
    "@odata.type": "microsoft.graph.iosVpnIKEv2SecurityAssociationParameters"
  },
  "serverCertificateCommonName": "String",
  "serverCertificateIssuerCommonName": "String",
  "tlsMaximumVersion": "String",
  "tlsMinimumVersion": "String"
}
```

